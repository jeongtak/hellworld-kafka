package hellworldkafka.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import hellworldkafka.config.kafka.KafkaProcessor;
import hellworldkafka.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ReceiveMessageRepository receiveMessageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='HelloPublished'"
    )
    public void wheneverHelloPublished_WorldConsumed(
        @Payload HelloPublished helloPublished
    ) {
        HelloPublished event = helloPublished;
        System.out.println(
            "\n\n##### listener WorldConsumed : " + helloPublished + "\n\n"
        );

        // Sample Logic //
        ReceiveMessage.worldConsumed(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
