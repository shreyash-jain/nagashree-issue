package com.example.demo1.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.enities.person;
import com.example.demo1.personrepository.personrepo;

@Service
public class service {
	
	List<person>l=new ArrayList<>(Arrays.asList((new person(1,"tom","nas")),(new person(2,"jerry","vantage"))));
	
	@Autowired
	personrepo per;
	public List<person> findallperson() {
//		return per.findAll();
		return l;
		
	}
	
    public person getpersonwithid(int id) {
		
		return l.get(id);
		
	}
  
    public void addnewperson(person p) {
        per.save(p);
    	
		
	}
    
    public void updatenewinfo(person p) {
		int id=p.getId();
		for(person p1:l) {
			if(p1.getId()==id) {
				l.remove(p1);
				l.add(p);
			}
		}
	}
    
    public void delete(int id) {
		for(person p1:l) {
			if(p1.getId()==id) {
				l.remove(p1);
			}
		}
    }

}
