package com.example.demo1;

import com.example.demo1.enities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.personrepository.EmployeeRepo;

@RestController
public class compnents {
	 

	@Autowired
	EmployeeRepo employeeRepo;
	
	@GetMapping("/persons")
	public ResponseEntity<String> getallperson() {

		Employee e = new Employee();
		e.setName("Shreyash");
		employeeRepo.save(e);

		return ResponseEntity.ok().body("Saved");
	}
	
//	@GetMapping("/persons/{id}")
//	public person getperson(@PathVariable int id) {
//
//		return js.getpersonwithid(id);
//
//	}
//
//	@PostMapping("/persons")
//	public void addperson(@RequestBody person p) {
//		js.addnewperson(p);
//	}
//
//	@PutMapping("/persons")
//	public void updateinfo(@RequestBody person p) {
//		js.updatenewinfo(p);
//
//	}
//
//	@DeleteMapping("/persons/{id}")
//	public void delete(@PathVariable int id) {
//    	js.delete(id);
//    }
//
	
}
