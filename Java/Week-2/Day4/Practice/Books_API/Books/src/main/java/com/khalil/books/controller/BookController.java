package com.khalil.books.controller;

import java.util.List;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khalil.books.models.Book;
import com.khalil.books.services.BookService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books/{bookId}")
	public String index(Model model,@PathVariable("bookId") Long bookId) {
		System.out.println(bookId);
		
		Book book=bookService.findBook(bookId);
		System.out.println(book);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	
	
}
