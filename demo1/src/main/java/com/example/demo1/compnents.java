package com.example.demo1;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import enities.person;
import services.service;

@RestController
public class compnents {
	 
	service js=new service();
	
	@GetMapping("/persons")
	public List<person> getallperson() {
		
		return js.findallperson();
	}
	
	@GetMapping("/persons/{id}")
	public person getperson(@PathVariable int id) {
		
		return js.getpersonwithid(id);
		
	}
	
	@PostMapping("/persons")
	public void addperson(@RequestBody person p) {
		js.addnewperson(p);
	}
	
	@PutMapping("/persons")
	public void updateinfo(@RequestBody person p) {
		js.updatenewinfo(p);
		
	}
	
	@DeleteMapping("/persons/{id}")
	public void delete(@PathVariable int id) {
    	js.delete(id);
    }
	
	
}
