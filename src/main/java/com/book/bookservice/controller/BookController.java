package com.book.bookservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookservice.entity.Book;
import com.book.bookservice.service.BookServiceIMPL;

//@Controller
@RestController
@RequestMapping("/api/book")
public class BookController {
	
	/*
	@RequestMapping(value="/",method =RequestMethod.GET)
	@ResponseBody
	public String getBookDetail() {
		return "new Book";
	}
	*/
	//@Controller+@ResponseBody = @restController
	
	//@RequestMapping(value="/",method =RequestMethod.GET)
	
	@Autowired
	private BookServiceIMPL bookServiceIMPL;
	
	@GetMapping("/")
	public List<Book>  getBookDetail() {
		List<Book> book  = bookServiceIMPL.getAllBook();
		return book;
	}
	
	@GetMapping("/{id}")
	public Book  getBookDetailByID(@PathVariable("id") int id) {
		Book book  = bookServiceIMPL.getById(id);
		return book;
	}
	
	@PostMapping("/")
	public Book  createBook(@RequestBody Book book) {
		Book book1  = bookServiceIMPL.createBook(book);
		return book1;
	}
	
	@DeleteMapping("/{id}")
	public void  deleteByID(@PathVariable("id") int id) {
		 bookServiceIMPL.getById(id);
		
	}
	
	

}
