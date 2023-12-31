package telran.java47.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import telran.java47.book.model.Publisher;

public interface PublisherRepository {
	List<String> findPublishersByAuthor(String authorName);
	Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);
	Optional<Publisher> findById(String publisher);
	Publisher save(Publisher publisher);
}
