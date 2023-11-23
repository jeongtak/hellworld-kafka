package hellworldkafka.domain;

import hellworldkafka.WorldApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ReceiveMessage_table")
@Data
//<<< DDD / Aggregate Root
public class ReceiveMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String message;

    public static ReceiveMessageRepository repository() {
        ReceiveMessageRepository receiveMessageRepository = WorldApplication.applicationContext.getBean(
            ReceiveMessageRepository.class
        );
        return receiveMessageRepository;
    }

    //<<< Clean Arch / Port Method
    public static void worldConsumed(HelloPublished helloPublished) {
        //implement business logic here:

        /** Example 1:  new item 
        ReceiveMessage receiveMessage = new ReceiveMessage();
        repository().save(receiveMessage);

        */

        /** Example 2:  finding and process
        
        repository().findById(helloPublished.get???()).ifPresent(receiveMessage->{
            
            receiveMessage // do something
            repository().save(receiveMessage);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
