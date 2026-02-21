package lucascarvy.com.github.booksystem.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "order_list")
public class OrderList {

///trocar todos os column de foreign key para a classe
    @Id
    @Column(name = "orderlistid")
    private String orderListId = UUID.randomUUID().toString();
    @ManyToOne
    @JoinColumn(name = "bookid") // coluna FK no banco
    private Book book;

    public OrderList() {
    }

    public OrderList(String orderListId, Book book) {
        this.orderListId = orderListId;
        this.book = book;
    }
}
