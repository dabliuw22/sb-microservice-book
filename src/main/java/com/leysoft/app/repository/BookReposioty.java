package com.leysoft.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.leysoft.app.entity.Book;

public interface BookReposioty extends CrudRepository<Book, Long> {}