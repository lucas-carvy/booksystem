package lucascarvy.com.github.booksystem.controller;

import lucascarvy.com.github.booksystem.model.entity.Collection;
import lucascarvy.com.github.booksystem.model.service.HttpAllRequestsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/collection")
public class CollectionController {

    private HttpAllRequestsService httpAllRequestsService;

    public CollectionController(HttpAllRequestsService httpAllRequestsService){
        this.httpAllRequestsService = httpAllRequestsService;
    }

    @PostMapping
    public Collection saveCollection(@RequestBody Collection collection){
        httpAllRequestsService.saveCollection(collection);
        return collection;
    }

}
