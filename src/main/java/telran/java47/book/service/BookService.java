package telran.java47.book.service;

import telran.java47.book.dto.AuthorDto;
import telran.java47.book.dto.BookDto;

public interface BookService {
	boolean addBook(BookDto bookDto);
	BookDto findBookByIsbn(String isbn);
	BookDto removeBook(String isbn);
	BookDto updateBook(String isbn, String newTitle);
	Iterable<BookDto> findBooksByAuthor(String authorName);
	Iterable<BookDto> findBooksByPublisher(String publisherName);
	Iterable<AuthorDto> findBookAuthors(String isbn);
	Iterable<String> findPublishersByAuthor(String authorName);
	AuthorDto removeAuthor(String authorName);
}
