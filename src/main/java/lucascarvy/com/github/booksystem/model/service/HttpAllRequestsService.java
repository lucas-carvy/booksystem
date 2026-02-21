package lucascarvy.com.github.booksystem.model.service;

import lucascarvy.com.github.booksystem.model.entity.Book;
import lucascarvy.com.github.booksystem.model.entity.Collection;
import lucascarvy.com.github.booksystem.repository.BookRepository;
import lucascarvy.com.github.booksystem.repository.CollectionRepository;
import lucascarvy.com.github.booksystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HttpAllRequestsService {

    private final BookRepository bookRepository;
    private final CollectionRepository collectionRepository;
    private final OrderRepository orderRepository;

    public HttpAllRequestsService(BookRepository bookRepository, CollectionRepository collectionRepository, OrderRepository orderRepository) {
        this.bookRepository = bookRepository;
        this.collectionRepository = collectionRepository;
        this.orderRepository = orderRepository;
    }


    public void saveCollection(Collection collection){
        System.out.println("Saved collection: " + collection.toString());
        collectionRepository.save(collection);
    }

    public void saveBook(Book book){
        System.out.println("Saved book: " + book.toString());
        bookRepository.save(book);
    }

    public void addBookToOrder(Book book){

        System.out.println("Added book to order: " + book.toString());
    }

    public void saveOrder(Collection collection, List<Book> bookOrderList){
        System.out.println("Saved collection: " + collection.toString());
        collectionRepository.save(collection);
    }



}
