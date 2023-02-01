package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library_book")
public class Library {
	@Id
	@GeneratedValue
	private Integer id;
	private String author;
	private String title;
	private float cost;
	
	
	public Library(Integer id, String author, String title, float cost) {
		super();
		
		this.id = id;
		this.author = author;
		this.title = title;
		this.cost = cost;
	}
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", author=" + author + ", title=" + title + ", cost=" + cost + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
