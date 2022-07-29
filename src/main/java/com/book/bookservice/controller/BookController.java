package com.book.bookservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		//List<Book> book  = bookServiceIMPL.getAllBook();
		List<Book> book  = new ArrayList<>();
		
		Book book1 = new Book("vicky","title",10);
		Book book2 = new Book("vicky1","title1",100);
		Book book3 = new Book("vicky2","title2",1000);
		Book book4 = new Book("vicky3","title3",10000);
		book.add(book1);
		book.add(book2);
		book.add(book3);
		book.add(book4);
		return book;
	}
	
	

}
