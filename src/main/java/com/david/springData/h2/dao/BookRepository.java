package com.david.springData.h2.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.david.springData.h2.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	

}
