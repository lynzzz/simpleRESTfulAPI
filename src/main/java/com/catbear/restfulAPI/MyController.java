package com.catbear.restfulAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value="/users", method=RequestMethod.GET)
	List<Client> display(){
		return users;
	}
	
	@RequestMapping(value="/users",  method=RequestMethod.POST)
	void add( @RequestBody Client c){
		users.add(c);
	}
	

	
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	void delete( @PathVariable  long id){
		for( Client c : users){
			if ( c.getId() == id){
				System.out.print("id is" + id );

				users.remove(c);
			}
		}
	}
}
