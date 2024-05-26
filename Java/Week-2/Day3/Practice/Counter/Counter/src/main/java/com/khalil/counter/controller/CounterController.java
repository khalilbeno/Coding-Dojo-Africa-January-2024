package com.khalil.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index (HttpSession session) {
 
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        } else {
            
            Integer count = (Integer) session.getAttribute("count");
         
            count++;
           
            session.setAttribute("count", count);
        }
		return "index.jsp";
	}

    @RequestMapping("/counter")
    public String counter (HttpSession session) {
        
        session.getAttribute("count");
       
        return "counter.jsp";
    }
}
