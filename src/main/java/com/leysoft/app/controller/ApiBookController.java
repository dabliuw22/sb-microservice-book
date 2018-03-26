package com.leysoft.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leysoft.app.entity.Book;
import com.leysoft.app.service.inter.BookService;

@RequestMapping(value = "/book")
@RestController
public class ApiBookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(value = {""})
	public List<Book> all() {
		return bookService.findAll();
	}
	
	@GetMapping(value = {"/{id}"})
	public Book get(@PathVariable("id") Long id) {
		return bookService.findById(id);
	}
}