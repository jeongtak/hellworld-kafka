package hellworldkafka.infra;

import hellworldkafka.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SendMessageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SendMessage>> {

    @Override
    public EntityModel<SendMessage> process(EntityModel<SendMessage> model) {
        return model;
    }
}
