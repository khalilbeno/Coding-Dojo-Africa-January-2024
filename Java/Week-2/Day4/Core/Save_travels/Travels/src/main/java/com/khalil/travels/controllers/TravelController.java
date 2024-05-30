package com.khalil.travels.controllers;

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

import com.khalil.travels.models.Travel;
import com.khalil.travels.services.TravelService;

import jakarta.validation.Valid;
@Controller
public class TravelController {
	@Autowired
	private TravelService travelServ;
	
	@GetMapping("/")
    public String home(@ModelAttribute("travel") Travel travel, Model model) {
    
    	List<Travel> travels =travelServ.allTravels() ;
    	model.addAttribute("allTravels", travels);
    	return "index.jsp";
    	}
	
	@PostMapping("/processNew")
    public String createTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	model.addAttribute("travels", travelServ.allTravels());
            return "index.jsp";
        } else {
            travelServ.createTravel(travel);
            return "redirect:/";
        }
    }
	
	@GetMapping("/travels/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Travel travel = travelServ.findTravel(id);
        model.addAttribute("travel", travel);
        return "edit.jsp";
    }
	
	@GetMapping("/travels/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Travel travel = travelServ.findTravel(id);
        model.addAttribute("travel", travel);
        return "show.jsp";
    }
    
    @PutMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("travel", travel);
            return "edit.jsp";
        } else {
            travelServ.updateTravel(travel);
            return "redirect:/";
        }
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
    	travelServ.deleteTravel(id);
    	 return "redirect:/";
    }
	
}
