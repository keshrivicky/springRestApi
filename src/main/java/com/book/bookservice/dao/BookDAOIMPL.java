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
		String query= "INSERT INTO employee.book (bookid,author_name,title,price) VALUES (?,?,?,?)";
		  jdbcTemplate.update(query,book.getBookId(),  book.getAuthorName(),book.getTitle(),book.getPrice());
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
		String query= "SELECT * FROM employee.book WHERE bookid=?";
		 Book book = jdbcTemplate.queryForObject(query,new BookRowMapper(),id);
		return book;
		
	}

	@Override
	public List<Book> getAllBook() {
		String query= "SELECT * FROM employee.book";
		 List<Book> book = jdbcTemplate.query(query,new BookRowMapper());
		return book;
	}

}
