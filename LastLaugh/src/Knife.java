/*
	Mike Plata
	CoSci 290

	Knife Class is an extension of the Weapon class
	The knife is a moderate damage weapon
*/

public class Knife extends Weapon{
	
	public Knife() {
		
		//assigns a value to the name property
		super.name = "Knife";
		
		//assigns a value to the type property
		super.type = "Knife";
		
		//assigns a value to the attack property
		super.attack = 6;
	}
}