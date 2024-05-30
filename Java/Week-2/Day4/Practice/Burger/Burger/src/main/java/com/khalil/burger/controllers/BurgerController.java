package com.khalil.burger.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.khalil.burger.models.Burger;
import com.khalil.burger.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	@Autowired
	private BurgerService burgerServ;
	
	@GetMapping("/")
    public String home(@ModelAttribute("burger") Burger burger, Model model) {
    
    	List<Burger> burgers =burgerServ.allBurgers() ;
    	model.addAttribute("allBurgers", burgers);
    	return "index.jsp";
    	}
	
	@PostMapping("/processNew")
    public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	model.addAttribute("burgers", burgerServ.allBurgers());
            return "index.jsp";
        } else {
            Burger newburger = burgerServ.createBurger(burger);
            return "redirect:/";
        }
    }
	
	@GetMapping("/burgers/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Burger burger = burgerServ.findBurger(id);
        model.addAttribute("burger", burger);
        return "edit.jsp";
    }
    
    @PutMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burger", burger);
            return "edit.jsp";
        } else {
            burgerServ.updateBurger(burger);
            return "redirect:/";
        }
    }
}
