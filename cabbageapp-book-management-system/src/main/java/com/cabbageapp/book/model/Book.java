package com.cabbageapp.book.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
	
	
	public Book() {
		
	}
	
	public Book(String name, String publisherId, String authorId, String price) {
		this.name = name;
		this.publisherId = publisherId;
		this.authorId = authorId;
		this.price = price;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id", unique = true, nullable = false)
	private long bookId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "publisher_id")
	private String publisherId;
	
	@Column(name = "author_id")
	private String authorId;
	
	@Column(name = "price")
	private String price;

	public long getBookid() {
		return bookId;
	}

	public void setBookid(long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	

}
