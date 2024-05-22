package com.khalil.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String nameQuery,@RequestParam(value="last",required=false) String lastQuery ) {
		if(nameQuery == null) {
			return "Hello Human";
		}else {
			if(lastQuery == null) {
				return "Hello " + nameQuery;
			}
			
		}return "Hello "+nameQuery+ lastQuery;
        
    }
}
