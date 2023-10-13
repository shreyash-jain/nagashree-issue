package personrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import enities.person;

@Repository
public interface personrepo extends JpaRepository <person,Integer>{
//	{
//		crud oprations
//	}
 
}
