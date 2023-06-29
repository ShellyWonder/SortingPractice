package main.animals;


public class Pig {

	// CREATE the field "name" which is a String
	private String name;
	// CREATE the field "status" which is a String
	private String status;
	public Pig() {
	}
	public Pig(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}			
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
