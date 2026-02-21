package lucascarvy.com.github.booksystem.repository;

import lucascarvy.com.github.booksystem.model.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {

    Optional<OrderItem> findByOrderOrderId(String orderId);
    Optional<OrderItem> findByBookName(String bookName);
    Optional<OrderItem> findByOrderOrderIdAndBookId(String orderId, String bookId);
}
