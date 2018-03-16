/*
	Mike Plata
	CoSci 290

<<<<<<< HEAD
	LightArmor class is an extension of the Armor class
	Light Armor is used by the Fighter class
	Light Armor has high defense
*/

public class LightArmor extends Armor{
	
	//the LightArmor class has one default constructor
	public LightArmor() {
		
		//assigns the indicated string to the name property
		super.name = "Light Armor";
		
		//assigns the indicated strong to the type property
		super.type = "Light Armor";
		
		//assigns the indicated value to the defense property
		super.defense = 8;
=======
	LightArmor class
*/

public class LightArmor extends Armor

public class LightArmor{
	
	//the LightArmor class has one default constructor
	public LightArmor() {
		
		//assigns the indicated string to the name property
		this.name = "Light Armor";
		
		//assigns the indicated strong to the type property
		this.type = "Light Armor";
		
		//assigns the indicated value to the defense property
		this.defense = 8;
>>>>>>> branch 'master' of https://github.com/mplata2891/cosci290.git
	}
}