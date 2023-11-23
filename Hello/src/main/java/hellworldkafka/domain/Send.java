package hellworldkafka.domain;

import hellworldkafka.HelloApplication;
import hellworldkafka.domain.HelloPublished;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Send_table")
@Data
//<<< DDD / Aggregate Root
public class Send {

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

    public static SendRepository repository() {
        SendRepository sendRepository = HelloApplication.applicationContext.getBean(
            SendRepository.class
        );
        return sendRepository;
    }
}
//>>> DDD / Aggregate Root
