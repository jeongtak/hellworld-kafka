package hellworldkafka.domain;

import hellworldkafka.WorldApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Receive_table")
@Data
//<<< DDD / Aggregate Root
public class Receive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String message;

    public static ReceiveRepository repository() {
        ReceiveRepository receiveRepository = WorldApplication.applicationContext.getBean(
            ReceiveRepository.class
        );
        return receiveRepository;
    }

    //<<< Clean Arch / Port Method
    public static void worldConsumed(HelloPublished helloPublished) {
        //implement business logic here:

        /** Example 1:  new item 
        Receive receive = new Receive();
        repository().save(receive);

        */

        /** Example 2:  finding and process
        
        repository().findById(helloPublished.get???()).ifPresent(receive->{
            
            receive // do something
            repository().save(receive);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
