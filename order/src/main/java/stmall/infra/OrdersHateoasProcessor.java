package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class OrdersHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Orders>> {

    @Override
    public EntityModel<Orders> process(EntityModel<Orders> model) {
        return model;
    }
}
