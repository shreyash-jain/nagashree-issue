package com.example.demo1.personrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.enities.person;

@Repository
public interface personrepo extends JpaRepository <person,Integer>{
//	{
//		crud oprations
//	}
 
}
