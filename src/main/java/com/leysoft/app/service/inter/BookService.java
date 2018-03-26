package com.leysoft.app.service.inter;

import java.util.List;

import com.leysoft.app.entity.Book;
public interface BookService {
	
	public Book save(Book book);
	
	public Book findById(Long id);
	
	public List<Book> findAll();
	
	public Book update(Book book);
	
	public boolean delete(Long id);
}