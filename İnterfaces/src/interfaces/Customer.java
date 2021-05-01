package interfaces;

public class Customer {
	
	private int id ;
	private String fistName;
	private String lastName;
	private String firstName;
	
	
	
	public Customer() {
	
	
		
	}



	public Customer(int id, String firstName, String lastName) {
		this.id = id;
		this.fistName = firstName;
		this.lastName = lastName;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFistName() {
		return fistName;
	}



	public void setFistName(String fistName) {
		this.fistName = fistName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	
	
	

}
