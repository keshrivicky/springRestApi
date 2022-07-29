package com.book.bookservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.book.bookservice.entity.Book;
import com.book.bookservice.rowmapper.BookRowMapper;

@Repository
public class BookDAOIMPL implements BookDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBook() {
		 List<Book> book = jdbcTemplate.query("SELECT * FROM employee.book", new BookRowMapper());
		return book;
	}

}
