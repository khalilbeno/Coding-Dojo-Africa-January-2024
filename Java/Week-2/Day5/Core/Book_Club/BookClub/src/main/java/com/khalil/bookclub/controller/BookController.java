package com.khalil.bookclub.controller;

import java.util.List;

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

import com.khalil.bookclub.models.Book;
import com.khalil.bookclub.models.User;
import com.khalil.bookclub.services.BookService;
import com.khalil.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

	@Autowired
	UserService userServ;
	@Autowired
	BookService bookServ;
	
	@GetMapping("/books")
	public String dashboard(HttpSession session, Model model) {
		Long user_id = (Long) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/";
		}
		List<Book> books= bookServ.getAllBook();
		model.addAttribute("books", books);
		User user = userServ.findUser(user_id);
		model.addAttribute("user", user);
		return "dashboard.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, Model model, HttpSession session) {
		Long user_id = (Long) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/";
		}
		User user = userServ.findUser(user_id);
		model.addAttribute("user", user);
		model.addAttribute("book", book);
		return "create.jsp";
	}
	
	@PostMapping("/createbook")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
		Long user_id = (Long) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/";
		}
		if (result.hasErrors()) {
			User user = userServ.findUser(user_id);
			model.addAttribute("user", user);
			model.addAttribute("book", book);
			return "create.jsp";
		} else {
			User user = userServ.findUser(user_id);
			book.setUser(user);
			bookServ.createBook(book);
			return "redirect:/books";
		}
		
		}
	@GetMapping("/books/{id}")
	public String showOne(@PathVariable("id") long id, Model model, HttpSession session) {
		Long user_id = (Long) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/";
		}
		User user = userServ.findUser(user_id);
		model.addAttribute("user", user);
		Book book = bookServ.findOne(id);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	@GetMapping("/books/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model, HttpSession session ) {
		Long user_id = (Long) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/";
		}
		User user = userServ.findUser(user_id);
		model.addAttribute("user", user);
		Book book = bookServ.findOne(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
    
    @PutMapping("/editBook/{id}")
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
    	Long user_id = (Long) session.getAttribute("user_id");
		if (user_id == null) {
			return "redirect:/";
		}
        if (result.hasErrors()) {
        	User user = userServ.findUser(user_id);
			model.addAttribute("user", user);
            model.addAttribute("book", book);
            return "edit.jsp";
        } else {
        	User user = userServ.findUser(user_id);
			book.setUser(user);
            bookServ.updateBook(book);
            return "redirect:/books";
        }
    }
    
    @DeleteMapping("/books/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
    	bookServ.deleteBook(id);
    	 return "redirect:/books";
    }
	
}