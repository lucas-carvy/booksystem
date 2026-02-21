package lucascarvy.com.github.booksystem.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Collection {

    @Id
    @Column(name = "collection_id")
    private String id = UUID.randomUUID().toString();
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "collection")
    private List<Book> books;

    public Collection() {
    }

    public Collection(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
