package lucascarvy.com.github.booksystem.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "orderid")
    private String orderId = UUID.randomUUID().toString();
    @Column(name = "totalprice")
    private BigDecimal totalValue = null;
    @Column(name = "orderlistid")
    private String orderListId;

    public Order() {
    }

    public Order(String orderId, BigDecimal totalValue) {
        this.orderId = orderId;
        this.totalValue = totalValue;
    }



}
