package lucascarvy.com.github.booksystem.model.service;

import lucascarvy.com.github.booksystem.model.entity.Book;
import lucascarvy.com.github.booksystem.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public BigDecimal totalPriceOrder() {
        return orderItemRepository.findAll()
                .stream()
                .map(Book::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void addBookToOrder(Book book, int quantity){
        int i;
        for(i = 1;i <= quantity; i++) {
            bookOrderList.add(book);
        }
    }

    public void removeBookFromOrder(Book book, int quantity) {
        int i;
        int count = 0;
        for (Book bookList : bookOrderList) {
            if (bookList.equals(book)) {
                count += 1;
            }
        }
        for(i = 1;i <= quantity; i++) {
            for (Book bookList2 : bookOrderList) {
                if (book.equals(bookList2)) {
                    bookOrderList.remove(book);
                    break;
                }
            }
        }
    }


}
