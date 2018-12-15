package example.rabbitmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.stereotype.Component;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2018/11/27
 */
@Component
public class RabbitFactory {


    private static RabbitProperties rabbitProperties;

    @Autowired
    public  void setRabbitProperties(RabbitProperties rabbitProperties) {
        RabbitFactory.rabbitProperties = rabbitProperties;
    }

    public static Connection getRabbitConnection() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername(rabbitProperties.getUsername());
        factory.setPassword(rabbitProperties.getPassword());
        factory.setVirtualHost("/");
        factory.setHost(rabbitProperties.getHost());
        factory.setPort(rabbitProperties.getPort());
        Connection conn = null;
        try {
            conn = factory.newConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
