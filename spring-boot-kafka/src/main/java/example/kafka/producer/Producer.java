package example.kafka.producer;

import example.kafka.model.MessageModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description : Kafka 消息生产者
 *
 * @author : xiaokui
 * @date : 2018/12/11
 */
@Component
public class Producer {

    @Resource
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void send(MessageModel messageModel){
        this.kafkaTemplate.send("testTopic",messageModel);
        System.out.println("生产消息:" + messageModel);
    }

}
