package hellworldkafka.infra;

import hellworldkafka.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMessageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ReceiveMessage>> {

    @Override
    public EntityModel<ReceiveMessage> process(
        EntityModel<ReceiveMessage> model
    ) {
        return model;
    }
}
