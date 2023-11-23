package hellworldkafka.domain;

import hellworldkafka.domain.*;
import hellworldkafka.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HelloPublished extends AbstractEvent {

    private Long id;
    private String userName;
    private String message;

    public HelloPublished(SendMessage aggregate) {
        super(aggregate);
    }

    public HelloPublished() {
        super();
    }
}
//>>> DDD / Domain Event
