package example.kafka;

import example.kafka.consumer.Consumer;
import example.kafka.model.MessageModel;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaApplicationTests {


   @Autowired
   private Consumer consumer;

    @Test
    public void contextLoads() throws Exception{
        long end = System.currentTimeMillis() + 10000;
        List<MessageModel> messageModelList = consumer.getMessageModels();
        while (messageModelList.size() != 1 && System.currentTimeMillis() < end){
            Thread.sleep(250);
        }

        Assertions.assertThat(messageModelList).hasSize(1);
        Assertions.assertThat(messageModelList.get(0).getMessage()).isEqualTo("A simple test message");

    }

}
