package com.book.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookservice.dao.BookDAO;
import com.book.bookservice.dao.BookDAOIMPL;
import com.book.bookservice.entity.Book;

@Service
public class BookServiceIMPL implements BookService{

	@Autowired
	private BookDAOIMPL bookDAOIMPL;
	@Override
	public Book createBook(Book book) {
		bookDAOIMPL.createBook(book);
		return book;
	}

	@Override
	public Book update(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book getById(int id) {
		Book book= bookDAOIMPL.getById(id);
		return book;
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		List<Book> book= bookDAOIMPL.getAllBook();
		return book;
	}

}
