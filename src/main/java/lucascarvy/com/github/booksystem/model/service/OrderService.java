package lucascarvy.com.github.booksystem.model.service;

import lucascarvy.com.github.booksystem.model.entity.Book;
import lucascarvy.com.github.booksystem.model.entity.Order;
import lucascarvy.com.github.booksystem.model.entity.OrderItem;
import lucascarvy.com.github.booksystem.repository.BookRepository;
import lucascarvy.com.github.booksystem.repository.OrderItemRepository;
import lucascarvy.com.github.booksystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderItemRepository orderItemRepository;
    private final BookRepository bookRepository;
    private final OrderRepository orderRepository;



    public OrderService(OrderItemRepository orderItemRepository, BookRepository bookRepository, OrderRepository orderRepository) {
        this.orderItemRepository = orderItemRepository;
        this.bookRepository = bookRepository;
        this.orderRepository = orderRepository;
    }

    public String createOrder(){
        Order order = new Order();
        orderRepository.save(order);
        return "Id Order: " + order.toString();
    }


    public BigDecimal totalPriceOrder(String orderId) {
        return orderItemRepository.findByOrderOrderId(orderId)
                .stream()
                .map(item -> item.getBook().getPrice()
                        .multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }


    public String addItemToOrder(String bookId, int quantity, String orderId){
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));


        OrderItem orderItem = new OrderItem(book, order, quantity);
        orderItemRepository.save(orderItem);

        return "Added item to order, follow details: " + orderItem.toString();
    }

    public String removeItemFromOrder(String bookId, String orderId, int quantity) {

        OrderItem orderItem = orderItemRepository.findByOrderOrderIdAndBookId(orderId, bookId)
                .orElseThrow(() -> new RuntimeException("OrderItem not found"));

        if(orderItem.getQuantity() >= quantity){
            int total = orderItem.getQuantity() - quantity;
            orderItem.setQuantity(total);
            if(orderItem.getQuantity() == 0){
                orderItemRepository.delete(orderItem);
            }
        }
        if(orderItem.equals(null))
        Optional<OrderItem> orderItem1;
        return "Changed item of order follow details: " + orderItem.toString();
    }


}
