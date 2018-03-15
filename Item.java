/*
  Mike Plata
  CoSci 290
  
  sample of an Item class for Text Adventure
  to be used by the Player class
*/

public class Item{

	//the Item class has 4 properties
	private String name;
	private int strengthMod;
	private int toughnessMod;
	private int intelligenceMod;
	  
	//the Item class has one defualt constructor
	public Item(){
	
		//assigns the indicated String to the name property
		this.name = "None";
		    
		//assigns the value of zero (0) to the strengthMod property
		this.strengthMod = 0;
		    
		//assigns the value of zero (0) to the toughnessMod property
		this.toughnessMod = 0;
		    
		//assigns the value of zero (0) to the intelligenceMod property
		this.intelligenceMod = 0;
	}
	
	//method to print (to screen) all class members with appropriate labels
	public void printArmor() {
			
		//print to screen the name property
		System.out.println("   Name: " + this.name);
			
		//print to screen the type property
		System.out.println("Str Mod: " + this.strengthMod);
			
		//print to screen the defense property
		System.out.println("Tuf Mod: " + this.toughnessMod);
		
		//print to screen the toughnessMod property
		System.out.println("Int Mod: " + this.intelligenceMod);
	}
	  
	//method to set the name property
	public void setName(String name){
	    
		//assigns the indicated String to the name property
		this.name = name;
	}
	  
	//method to return the value of the name property
	public String getName(){
	    
		//returns the value of the name property
		return this.name;
	}
	  
	//method to set the strengthMod property
	public void setStrengthMod(int newValue){
	    
		//assigns the value of newValue to strengthMod property
		this.strengthMod = newValue;
	}
	  
	//method to return the value of the strengthMod property
	public int getStrengthMod(){
	    
		//returns the value of the strengthMod property
		return this.strengthMod;
	}
	  
	//method to set the toughnessMod property
	public void setToughnessMod(int newValue){
	    
		//assigns the value of newValue to toughnessMod property
		this.toughnessMod = newValue;
	}
	  
	//method to return the value of the toughnessMod property
	public int getToughnessMod(){
	    
		//returns the value of the toughnessMod property
		return this.toughnessMod;
	}
	  
	//method to set the intelligenceMod property
	public void setIntelligenceMod(int newValue){
	    
		//assigns the value of newValue to intelligenceMod property
		this.intelligenceMod = newValue;
	}
	  
	//method to return the value of the intelligenceMod property
	public int getIntelligenceMod(){
	    
		//returns the value of the defMod property
		return this.intelligenceMod;
	}
}