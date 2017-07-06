package com.catbear.restfulAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.catbear.restfulAPI.model.Client;
import com.fasterxml.jackson.databind.ObjectMapper;;

@RestController
public class MyController {
    
    static List<Client> users = Collections.synchronizedList(new ArrayList<>()); 

	
	
	@RequestMapping(value="/add",  method=RequestMethod.POST)
	void f( @RequestBody Client c){

		System.out.println(c.getAge());
		users.add(c);
	}
	
	@RequestMapping(value="/display", method=RequestMethod.GET)
		List<Client> f(){
			return users;
		}
}
