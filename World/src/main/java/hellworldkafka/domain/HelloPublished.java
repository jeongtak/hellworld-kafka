package hellworldkafka.domain;

import hellworldkafka.domain.*;
import hellworldkafka.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class HelloPublished extends AbstractEvent {

    private Long id;
    private String userName;
    private String message;
}
