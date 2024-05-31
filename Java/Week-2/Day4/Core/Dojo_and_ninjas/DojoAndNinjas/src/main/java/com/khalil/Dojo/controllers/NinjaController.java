package com.khalil.Dojo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.khalil.Dojo.models.Dojo;
import com.khalil.Dojo.models.Ninja;
import com.khalil.Dojo.services.DojoService;
import com.khalil.Dojo.services.NinjaService;

import jakarta.validation.Valid;
@Controller
public class NinjaController {
	@Autowired
	NinjaService ninjaServ;
	@Autowired
	DojoService dojoServ;
	
	@GetMapping("/ninjas/new")
	public String newNinjas(@ModelAttribute("ninja") Ninja ninja,Model model) {
		List<Dojo> dojos = dojoServ.allDojos();
		model.addAttribute("dojos", dojos);
		return "createNinja.jsp";
	}
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "createNinja.jsp";
        } else {
            ninjaServ.createNinja(ninja);
            return "redirect:/";
        }
    }
}
