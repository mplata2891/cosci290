/*
  Mike Plata
  CoSci 290
  
<<<<<<< HEAD
  Armor is an abstract class that will be inherited
  by other 'specific Armor subclasses
*/

public class Armor extends GamePiece{

	//the Armor class has 2 properties
	private String name;
	private String type;
	private int defense;
	  
	//the Armor class has 1 defualt constructor
	public Armor(){
	
		//assigns the indicated String to the name property
		this.name = "None";
		  
		//assigns the indicated String to the type property
		this.type = "N/A";
		    
		//assigns the value of zero (0) to the defense property
		this.defense = 0;
	}
	  
	//method to set the name property
	public void setName(String newName){
	    
		//assigns the value of newName to the name property
		this.name = newName;
	}
	
	//method to return the value of the name property
	public String getName(){
		    
		//returns the value of the name property
		return this.name;
	}
	  
	//method to set the type property
	public void setType(String newType) {
		  
		//assigns the value of newType to type
		this.type = newType;
	}
	  
	//method to return the value of the type property
	public String getType() {
		  
		//returns the value of the type property
		return type;
	}
	  
	//method to set the defense property
	public void setDefense(int newValue){
	    
		//assigns the value of newValue to the defense property
		this.defense = newValue;
	}
	  
	//method to return the value of the defense property
	public int getDefnse(){
	    
		//returns the value of the defMod property
		return this.defense;
	}
	
	//method to return the object members as a string
	public String toString() {
		
		//returns object members as a string
		return ("Name: " + this.name + "\n"
				+ "Type: " + this.type + "\n"
				+ " Def: " + this.defense "\n\n");
=======
  sample of an Armor class for Text Adventure
  to be used by the Player class
*/

public class Armor{

	//the Armor class has 2 properties
	private String name;
	private String type;
	private int defense;
	  
	//the Armor class has 1 defualt constructor
	public Armor(){
	
		//assigns the indicated String to the name property
		this.name = "None";
		  
		//assigns the indicated String to the type property
		this.type = "N/A";
		    
		//assigns the value of zero (0) to the defense property
		this.defense = 0;
	}
	
	//method to print (to screen) all class members with appropriate labels
	public void printArmor() {
		
		//print to screen the name property
		System.out.println("Name: " + this.name);
		
		//print to screen the type property
		System.out.println("Type: " + this.type);
		
		//print to screen the defense property
		System.out.println(" Def: " + this.defense);
	}
	  
	//method to set the name property
	public void setName(String newName){
	    
		//assigns the value of newName to the name property
		this.name = newName;
	}
	
	//method to return the value of the name property
	public String getName(){
		    
		//returns the value of the name property
		return this.name;
	}
	  
	//method to set the type property
	public void setType(String newType) {
		  
		//assigns the value of newType to type
		this.type = newType;
	}
	  
	//method to return the value of the type property
	public String getType() {
		  
		//returns the value of the type property
		return type;
	}
	  
	//method to set the defense property
	public void setDefense(int newValue){
	    
		//assigns the value of newValue to the defense property
		this.defense = newValue;
	}
	  
	//method to return the value of the defense property
	public int getDefnse(){
	    
		//returns the value of the defMod property
		return this.defense;
>>>>>>> branch 'master' of https://github.com/mplata2891/cosci290.git
	}
}