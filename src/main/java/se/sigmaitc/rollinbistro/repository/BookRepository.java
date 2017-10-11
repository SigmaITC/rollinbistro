package se.sigmaitc.rollinbistro.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import se.sigmaitc.rollinbistro.entity.Book;
import se.sigmaitc.rollinbistro.entity.Person;

public interface BookRepository extends Repository<Book, Long> {

    List<Book> findAll();

    Book findByNameAndAuthorAllIgnoringCase(String name, Person author);
    
    Book findByName(String name);

}
