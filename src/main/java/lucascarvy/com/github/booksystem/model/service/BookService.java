package lucascarvy.com.github.booksystem.model.service;

import lucascarvy.com.github.booksystem.model.entity.Book;
import lucascarvy.com.github.booksystem.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(Book book){
        System.out.println("Saved book: " + book.toString());
        bookRepository.save(book);
    }

}
