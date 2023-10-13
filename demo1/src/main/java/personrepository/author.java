package personrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import enities.person;

public interface author extends JpaRepository <person,Integer>{

}
