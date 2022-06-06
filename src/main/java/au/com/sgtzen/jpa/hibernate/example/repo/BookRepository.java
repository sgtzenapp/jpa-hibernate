package au.com.sgtzen.jpa.hibernate.example.repo;

import au.com.sgtzen.jpa.hibernate.example.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}
