package com.david.springData.h2;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.david.springData.h2.model.Book;
import com.david.springData.h2.service.BookService;

public class Application {

	public static void main(String[] args) {
		 try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfiguration.class)){
			 BookService service=context.getBean(BookService.class);
			Book book=new Book("First Book", new Date(), 33, new BigDecimal("26.00"));
			service.save(book);
			book.setBookId(null);
			book.setTitle("Java Book");
			service.save(book);
			
			service.getAllBook().forEach(b->System.out.println(b));
			
		 }
		 
		 

	}

}
