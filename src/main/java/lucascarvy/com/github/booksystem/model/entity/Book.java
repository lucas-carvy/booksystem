package lucascarvy.com.github.booksystem.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @Column(name = "book_id")
    private String id = UUID.randomUUID().toString();
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "collection_id")
    private Collection collection;

    public Book() {
    }

    public Book(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.collection = null;
    }

    public Book(String id, String name, BigDecimal price, Collection collection) {
        this.id = id;
        this.collection = collection;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", collection='" + collection + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
