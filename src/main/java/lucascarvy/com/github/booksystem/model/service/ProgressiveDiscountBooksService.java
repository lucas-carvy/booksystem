package lucascarvy.com.github.booksystem.model.service;

import lucascarvy.com.github.booksystem.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProgressiveDiscountBooksService {

    private final BookRepository bookRepository;



    public ProgressiveDiscountBooksService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }



}
