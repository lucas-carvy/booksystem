package lucascarvy.com.github.booksystem.controller;

import lucascarvy.com.github.booksystem.model.entity.Collection;
import lucascarvy.com.github.booksystem.model.service.CollectionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/collection")
public class CollectionController {

    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService){
        this.collectionService = collectionService;
    }

    @PostMapping
    public Collection saveCollection(@RequestBody Collection collection){
        collectionService.saveCollection(collection);
        return collection;
    }

}
