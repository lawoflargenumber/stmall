package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ItemRetrieved extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String itemId;
    private String quantity;
    private String address;

    public ItemRetrieved(Delivery aggregate) {
        super(aggregate);
    }

    public ItemRetrieved() {
        super();
    }
}
//>>> DDD / Domain Event
