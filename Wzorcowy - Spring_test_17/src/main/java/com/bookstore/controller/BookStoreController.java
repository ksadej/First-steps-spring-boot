package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.entity.Book;
import com.bookstore.services.IBookStoreService;

@Controller
@RequestMapping("bookservice")
public class BookStoreController {

	@Autowired
	private IBookStoreService service;
	
	@GetMapping("books")
	public ResponseEntity<List<Book>> getBooks(){
		
		List<Book> books = service.getBooks();
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
		
	}
	
	@GetMapping("books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer id){
		Book book = service.getBook(id);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
}
