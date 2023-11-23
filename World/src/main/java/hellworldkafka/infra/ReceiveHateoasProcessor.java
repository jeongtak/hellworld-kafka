package hellworldkafka.infra;

import hellworldkafka.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReceiveHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Receive>> {

    @Override
    public EntityModel<Receive> process(EntityModel<Receive> model) {
        return model;
    }
}
