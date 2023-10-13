package com.example.demo1.personrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.enities.person;

public interface author extends JpaRepository <person,Integer>{

}
