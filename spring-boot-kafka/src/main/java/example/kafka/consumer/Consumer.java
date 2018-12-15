package example.kafka.consumer;

import example.kafka.model.MessageModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Description : 消息消费者
 *
 * @author : xiaokui
 * @date : 2018/12/11
 */
@Component
public class Consumer {

    private List<MessageModel> messageModels = new CopyOnWriteArrayList<>();

    @KafkaListener(topics = "testTopic")
    public void processMessage(MessageModel messageModel){
        this.messageModels.add(messageModel);
        System.out.println("");
    }

    public List<MessageModel> getMessageModels() {
        return messageModels;
    }

}
