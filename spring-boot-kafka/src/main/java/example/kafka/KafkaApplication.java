package example.kafka;

import example.kafka.model.MessageModel;
import example.kafka.producer.Producer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author xiaokui
 */
@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(Producer producer){
        return (args) -> producer.send(new MessageModel(1,"A simple test message"));
    }
}
