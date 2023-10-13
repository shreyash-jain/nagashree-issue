package enities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class employee {
     @Id
	int id;
	String name;
	String spouse;
	
	
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public employee() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
