package com.cabbageapp.book.model;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {
	
	public Author() {
		
	}
	
	public Author(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "author_id", unique = true, nullable = false)
	private long authorId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + authorId + ", name=" + name + ", address=" + address
				+ "]";
	}

}
