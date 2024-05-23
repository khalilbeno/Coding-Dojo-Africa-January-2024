package com.khalil.daikachipath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichipathController {
	
	    @RequestMapping("/travel/{destination}")
	    public String travel(@PathVariable("destination") String destination){
	    	return "congrats you will soon travel to " +destination ;
	    }
	    @RequestMapping("/lotto/{num}")
	    public String travel(@PathVariable("num") int num){
	    	if(num%2==0) {
	    		return "you will take a grand journey in the near future,but be wary of tempting offers";
	    	}else {
	    		
	    		return "you have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	    	}
	    }
	}
