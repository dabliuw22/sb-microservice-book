package com.leysoft.app.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leysoft.app.entity.Book;
import com.leysoft.app.repository.BookReposioty;
import com.leysoft.app.service.inter.BookService;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookReposioty bookReposioty;
	
	@Override
	public Book save(Book book) {
		return bookReposioty.save(book);
	}

	@Override
	public Book findById(Long id) {
		return bookReposioty.findOne(id);
	}

	@Override
	public List<Book> findAll() {
		return (List<Book>) bookReposioty.findAll();
	}

	@Override
	public Book update(Book book) {
		return bookReposioty.save(book);
	}

	@Override
	public boolean delete(Long id) {
		boolean deleted = false;
		if(findById(id) != null) {
			bookReposioty.delete(id);
			deleted = true;
		}
		return deleted;
	}
}