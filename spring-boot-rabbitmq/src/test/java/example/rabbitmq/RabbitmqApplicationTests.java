package example.rabbitmq;

import com.rabbitmq.client.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

    @Test
    public void publisher() {
        Connection connection = RabbitFactory.getRabbitConnection();
        if(connection !=  null){
            try {
                Channel channel = connection.createChannel();
                channel.queueDeclare("hello",false,false,false,null);
                String content = String.format("当前时间: %s",new Date().getTime());
                channel.basicPublish("","hello",null,content.getBytes());
                System.out.println("已发送消息:" + content);

                channel.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void consumer(){
        Connection connection = RabbitFactory.getRabbitConnection();
        if(connection != null){
            try {
                Channel channel = connection.createChannel();
                channel.queueDeclare("hello",false,false,false,null);
                channel.basicConsume("hello",false,"",new DefaultConsumer(channel){
                    @Override
                    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                        //队列名称
                       String routingKey = envelope.getRoutingKey();
                        System.out.println("队列名称:" + routingKey);
                       // 内容类型
                        String contentType = properties.getContentType();
                        String content = new String(body, Charset.defaultCharset());
                        System.out.println("消息正文:" + content);
                        channel.basicAck(envelope.getDeliveryTag(),false);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
