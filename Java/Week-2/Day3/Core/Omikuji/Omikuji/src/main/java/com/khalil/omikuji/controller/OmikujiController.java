package com.khalil.omikuji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {
	@GetMapping("/omikuji")
    public String omikuji() {
        return "form.jsp";
    }

    @PostMapping("/send")
    public String send(
        @RequestParam("number") int number, 
        @RequestParam("city") String city, 
        @RequestParam("person") String person,
        @RequestParam("profession") String profession, 
        @RequestParam("living") String living, 
        @RequestParam("nice") String nice,
        HttpSession session ) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("profession", profession);
        session.setAttribute("living", living);
        session.setAttribute("nice", nice);

        return "redirect:/show";
        }
    
    @GetMapping("/show")
    public String result() {
        return "show.jsp";
    }
}
