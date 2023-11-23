package hellworldkafka.domain;

import hellworldkafka.HelloApplication;
import hellworldkafka.domain.HelloPublished;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SendMessage_table")
@Data
//<<< DDD / Aggregate Root
public class SendMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String message;

    @PostPersist
    public void onPostPersist() {
        HelloPublished helloPublished = new HelloPublished(this);
        helloPublished.publishAfterCommit();
    }

    public static SendMessageRepository repository() {
        SendMessageRepository sendMessageRepository = HelloApplication.applicationContext.getBean(
            SendMessageRepository.class
        );
        return sendMessageRepository;
    }
}
//>>> DDD / Aggregate Root
