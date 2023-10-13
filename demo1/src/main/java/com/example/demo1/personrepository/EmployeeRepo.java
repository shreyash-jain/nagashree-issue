package com.example.demo1.personrepository;

import com.example.demo1.enities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

}
