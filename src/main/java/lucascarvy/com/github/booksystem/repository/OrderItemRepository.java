package lucascarvy.com.github.booksystem.repository;

import lucascarvy.com.github.booksystem.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<Order, String> {
}
