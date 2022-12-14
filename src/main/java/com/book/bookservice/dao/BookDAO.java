package com.book.bookservice.dao;

import java.util.List;

import com.book.bookservice.entity.Book;

public interface BookDAO {
	
	public Book createBook(Book book);
	public Book update(Book book);
	public boolean delete(int id);
	public Book getById(int id);
	public List<Book> getAllBook();

}
