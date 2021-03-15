package AntbidzTeam3.AntBidz.repositories;

import AntbidzTeam3.AntBidz.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
