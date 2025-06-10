package stmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmall.OrderApplication;
import stmall.domain.OrdeCanceled;
import stmall.domain.OrderPlaced;

@Entity
@Table(name = "Orders_table")
@Data
//<<< DDD / Aggregate Root
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String address;

    private String itemId;

    private Integer quantity;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        OrdeCanceled ordeCanceled = new OrdeCanceled(this);
        ordeCanceled.publishAfterCommit();
    }

    public static OrdersRepository repository() {
        OrdersRepository ordersRepository = OrderApplication.applicationContext.getBean(
            OrdersRepository.class
        );
        return ordersRepository;
    }

    //<<< Clean Arch / Port Method
    public static void sendAlert(StockIncreased stockIncreased) {
        //implement business logic here:

        /** Example 1:  new item 
        Orders orders = new Orders();
        repository().save(orders);

        */

        /** Example 2:  finding and process
        

        repository().findById(stockIncreased.get???()).ifPresent(orders->{
            
            orders // do something
            repository().save(orders);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(ItemRetrieved itemRetrieved) {
        //implement business logic here:

        /** Example 1:  new item 
        Orders orders = new Orders();
        repository().save(orders);

        */

        /** Example 2:  finding and process
        

        repository().findById(itemRetrieved.get???()).ifPresent(orders->{
            
            orders // do something
            repository().save(orders);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Orders orders = new Orders();
        repository().save(orders);

        */

        /** Example 2:  finding and process
        

        repository().findById(deliveryCompleted.get???()).ifPresent(orders->{
            
            orders // do something
            repository().save(orders);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
