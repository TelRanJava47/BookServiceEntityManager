package telran.java47.book.dao;

import java.util.Optional;
import java.util.stream.Stream;
import telran.java47.book.model.Book;

public interface BookRepository  {
	Stream<Book> findByAuthorsName(String authorName);
	Stream<Book> findByPublisherPublisherName(String publisherName);
	boolean existsById(String isbn);
	Book save(Book book);
	Optional<Book> findById(String isbn);
	void deleteById(String isbn);
}
