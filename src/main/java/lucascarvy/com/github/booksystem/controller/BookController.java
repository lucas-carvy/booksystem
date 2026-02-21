package lucascarvy.com.github.booksystem.controller;

import lucascarvy.com.github.booksystem.model.entity.Book;
import lucascarvy.com.github.booksystem.model.service.HttpAllRequestsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final HttpAllRequestsService httpAllRequestsService;

    public BookController(HttpAllRequestsService httpAllRequestsService){
        this.httpAllRequestsService = httpAllRequestsService;
    }


    @PostMapping
    public Book saveBook(@RequestBody Book book){
        httpAllRequestsService.saveBook(book);
        return book;
    }


}
