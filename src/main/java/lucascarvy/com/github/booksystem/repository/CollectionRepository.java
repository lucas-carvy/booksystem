package lucascarvy.com.github.booksystem.repository;

import lucascarvy.com.github.booksystem.model.entity.Collection;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CollectionRepository extends JpaRepository<Collection, String> {

}
