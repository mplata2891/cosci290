/*
	Mike Plata
	CoSci 290

	Cloak class is an extension of the armor class
	Cloak is an armor used by the Class MagicUser
	Cloak provides light protection against attacks
*/

public class Cloak extends Armor{
	
	//the Cloak class has one default constructor
	public Cloak() {
		
		//assigns the indicated string to the name property
		super.name = "Cloak";
		
		//assigns the indicated strong to the type property
		super.type = "Cloak";
		
		//assigns the indicated value to the defense property
		super.defense = 4;
	}
}