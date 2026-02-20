package lucascarvy.com.github.booksystem.model.service;

import lucascarvy.com.github.booksystem.model.entity.Book;
import lucascarvy.com.github.booksystem.model.entity.Collection;
import lucascarvy.com.github.booksystem.repository.BookRepository;
import lucascarvy.com.github.booksystem.repository.CollectionRepository;
import org.springframework.stereotype.Service;

@Service
public class HttpAllRequestsService {

    private BookRepository bookRepository;
    private CollectionRepository collectionRepository;

    public HttpAllRequestsService(BookRepository bookRepository, CollectionRepository collectionRepository) {
        this.bookRepository = bookRepository;
        this.collectionRepository = collectionRepository;
    }


    public void saveCollection(Collection collection){
        System.out.println("Saved collection: " + collection.toString());
        collectionRepository.save(collection);
    }

    public void saveBook(Book book){
        System.out.println("Saved book: " + book.toString());
        bookRepository.save(book);
    }

}
