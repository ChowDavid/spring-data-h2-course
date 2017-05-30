package com.david.springData.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.springData.h2.dao.BookRepository;
import com.david.springData.h2.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository repo;
	
	public void save(Book book){
		repo.save(book);
	}
	
	public List<Book> getAllBook(){
		return repo.findAll();
	}
	
	
}
