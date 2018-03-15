/*
	Mike Plata
	CoSci 290
	
	Human Class
*/

public class Person extends GamePiece{

	//the Human class has 3 class members/properties
	private String firstName;
	private String lastName;
	private int age;
	
	
	//the Human class has 1 implicit constructor
	public Human(String first, String last, int someAge) {
		
		//assigns the value of first to the firstName property
		this.firstName = first;
		
		//assigns the value of last to the lastName property
		this.lastName = last;
		
		//assigns the value of someAge to the age property
		this.age = someAge;
	}
	
	/*
	 * The Human class has 8 public methods
	 */
	
	//method to return the full name of the Human object
	public String fullName(){
		    
		//returns a concatenated string consisting of the 
		//first and last name properties
		return (this.firstName + " " + this.lastName);
	}
		  
	//method to assign a value to the firstName property
	public void setFirstName(String newFirstName){
		    
		//assigns the value of newFirstName to firstName
		this.firstName = newFirstName;
	}
		  
	//method to return the value of the firstName property
	public String getFirstName(){
		    
		//retrurns the value of the firstName property
		return this.firstName;
	}
		  
	//method to assign a value to the lastName property
	public void setLastName(String newLastName){
		    
		//assigns the value of newLastName to lastName
		this.lastName = newLastName;
	}
		  
	//method to return the value of the lastName property
	public String getLastName(){
		    
		//retrurns the value of the lastName property
		return this.lastName;
	}
		  
	//method to assign a value to the age property
	public void setAge(int years){
		    
		//assigns the value of years to age
		this.age = years;
	}
		  
	//method to return the value of the age property
	public int getAge(){
		    
		//retrurns the value of the age property
		return this.age;
	}
	
	//method to return object properties as string
	public String toString() {
		
		//returns object properties as string
		return ("First Name: " + this.firstName + "\n"
				+ "Last Name: " + this.lastName + "\n"
				+ "Age: " + this.age + "\n\n");
	}
}