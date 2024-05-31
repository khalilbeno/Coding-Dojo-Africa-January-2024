package com.khalil.Dojo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.khalil.Dojo.models.Dojo;
import com.khalil.Dojo.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {
	@Autowired
	private DojoService dojoServ;
	
	@GetMapping("/")
    public String home(@ModelAttribute("dojo") Dojo dojo ,Model model) {
		List<Dojo> dojos = dojoServ.allDojos();
		model.addAttribute("dojos", dojos);
    	return "index.jsp";
    	}
	@GetMapping("/dojos/{id}")
	public String newDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoServ.findOne(id));
		return "show.jsp";
	}
	
	
	@PostMapping("/processNew")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	model.addAttribute("dojos", dojoServ.allDojos());
            return "index.jsp";
        } else {
            dojoServ.createDojo(dojo);
            return "redirect:/";
        }
    }
}
