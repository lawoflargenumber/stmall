package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class OrdeCanceled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String address;
    private String itemId;
    private Integer quantity;
    private String orderId;
}
