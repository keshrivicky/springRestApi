package com.book.bookservice.entity;

public class Book {
	
	private int bookId;
	private String AuthorName;
	private String title;
	private int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book( String authorName, String title, int price) {
		super();
		AuthorName = authorName;
		this.title = title;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", AuthorName=" + AuthorName + ", title=" + title + ", price=" + price + "]";
	}
	
	
	

}
