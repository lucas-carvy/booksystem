package lucascarvy.com.github.booksystem.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Book {

    @Id
    @Column(name = "id")
    private String id = UUID.randomUUID().toString();
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "collectionid")
    private String collectionid;

    public Book() {
    }

    public Book(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.collectionid = null;
    }

    public Book(String id, String name, BigDecimal price, String collectionid) {
        this.id = id;
        this.collectionid = collectionid;
        this.price = price;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCollectionid() {
        return collectionid;
    }

    public void setCollectionid(String collectionid) {
        this.collectionid = collectionid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", collectionid='" + collectionid + '\'' +
                '}';
    }
}
