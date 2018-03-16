/*
	Mike Plata
	CoSci 290

<<<<<<< HEAD
	LeatherArmor class is an extension of the Armor class
	LeahterArmor is used by the Rogue class
	Leather Armor has moderate defense
*/

public class LeatherArmor extends Armor{
	
	//the LeatherArmor class has one default constructor
	public LeatherArmor() {
		
		//assigns the indicated string to the name property
		super.name = "Leather Armor";
		
		//assigns the indicated strong to the type property
		super.type = "Leather Armor";
		
		//assigns the indicated value to the defense property
		super.defense = 6;
=======
	LeatherArmor class
*/

public class LeatherArmor extends Armor

public class LeatherArmor{
	
	//the LeatherArmor class has one default constructor
	public LeatherArmor() {
		
		//assigns the indicated string to the name property
		this.name = "Leather Armor";
		
		//assigns the indicated strong to the type property
		this.type = "Leather Armor";
		
		//assigns the indicated value to the defense property
		this.defense = 6;
>>>>>>> branch 'master' of https://github.com/mplata2891/cosci290.git
	}
}