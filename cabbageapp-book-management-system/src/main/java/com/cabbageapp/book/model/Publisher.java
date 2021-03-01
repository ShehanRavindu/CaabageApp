package com.cabbageapp.book.model;

import javax.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {
	
	public Publisher() {
		
	}
	
	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "publisher_id", unique = true, nullable = false)
	private long publisherId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;

	public long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(long publisherId) {
		this.publisherId = publisherId;
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
		return "Employee [id=" + publisherId + ", name=" + name + ", address=" + address
				+ "]";
	}

}
