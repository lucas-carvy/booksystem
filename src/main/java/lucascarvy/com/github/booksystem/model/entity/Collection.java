package lucascarvy.com.github.booksystem.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


import java.util.UUID;

@Entity
public class Collection {

    @Id
    @Column(name = "collectionid")
    private String id = UUID.randomUUID().toString();
    @Column(name = "name")
    private String name;

    public Collection() {
    }

    public Collection(String name, String id) {
        this.name = name;
        this.id = id;
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

    @Override
    public String toString() {
        return "Collection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
