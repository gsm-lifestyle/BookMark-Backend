package lifestyle.bookmark.domain.book.domain.repository;

import lifestyle.bookmark.domain.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
    boolean existsByBookTitle(String bookTitle);
    Optional<Book> findByBookTitle(String bootTitle);
}
