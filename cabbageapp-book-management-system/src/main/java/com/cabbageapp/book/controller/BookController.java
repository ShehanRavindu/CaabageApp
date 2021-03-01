package com.cabbageapp.book.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cabbageapp.book.model.Author;
import com.cabbageapp.book.model.Book;
import com.cabbageapp.book.model.Publisher;
import com.cabbageapp.book.repository.AuthorRepository;
import com.cabbageapp.book.repository.BookRepository;
import com.cabbageapp.book.repository.PublisherRepository;

@RestController
@RequestMapping("/api/vi")
public class BookController {
	
	@Autowired
	private BookRepository bookRepsitory;
	
	@Autowired
	private AuthorRepository authorRepsitory;
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	@GetMapping("/books")
    public Iterable<Book> getAllEmployees() {
		return bookRepsitory.findAll();
    }
	
	@GetMapping("/books/{id}")
	public Optional<Book> getBookById(@PathVariable(value = "id") Long bookId) {
	    return bookRepsitory.findById(bookId);
	}
	
	@PostMapping("/add/books")
	public Book addBook(@RequestBody Book book) {
		return bookRepsitory.save(book);
	}
	
	@DeleteMapping("/delete/books/{id}")
	public void deleteBookById(@PathVariable(value = "id") Long bookId) {
	    bookRepsitory.deleteById(bookId);
	}
	
	@GetMapping("/author")
    public Iterable<Author> getAllAuthors() {
		return authorRepsitory.findAll();
    }
	
	@GetMapping("/author/{id}")
	public Optional<Author> getAuthorsById(@PathVariable(value = "id") Long authorId) {
	    return authorRepsitory.findById(authorId);
	}
	
	@PostMapping("/add/author")
	public Author addAuthors(@RequestBody Author author) {
		return authorRepsitory.save(author);
	}
	
	@DeleteMapping("/delete/author/{id}")
	public void deleteAuthorsById(@PathVariable(value = "id") Long authorId) {
		authorRepsitory.deleteById(authorId);
	}
	
	@GetMapping("/publisher")
    public Iterable<Publisher> getAllPublisher() {
		return publisherRepository.findAll();
    }
	
	@GetMapping("/publisher/{id}")
	public Optional<Publisher> getPublishersById(@PathVariable(value = "id") Long publisherId) {
	    return publisherRepository.findById(publisherId);
	}
	
	@PostMapping("/add/publisher")
	public Publisher addPublisher(@RequestBody Publisher publisher) {
		return publisherRepository.save(publisher);
	}
	
	@DeleteMapping("/delete/publisher/{id}")
	public void deletePublisherById(@PathVariable(value = "id") Long publisherId) {
		publisherRepository.deleteById(publisherId);
	}

}
