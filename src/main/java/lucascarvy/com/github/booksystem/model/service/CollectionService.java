package lucascarvy.com.github.booksystem.model.service;

import lucascarvy.com.github.booksystem.model.entity.Collection;
import lucascarvy.com.github.booksystem.repository.CollectionRepository;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {


    private final CollectionRepository collectionRepository;


    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public void saveCollection(Collection collection){
        System.out.println("Saved collection: " + collection.toString());
        collectionRepository.save(collection);
    }

}
