package lucascarvy.com.github.booksystem.repository;

import lucascarvy.com.github.booksystem.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
