/*
	Mike Plata
	CoSci 290
	
	SpellBook class is used exclusively by
		the MagicUser class
*/

public class SpellBook{
	
	private Spell[] numberOfSpells;
	
	public SpellBook() {
		
		//creates an array of type Spell with size one
		this.numberOfSpells = new Spell[1];
		
		//assigns a value to the numberOfSpell array, index zero
		this.numberOfSpells[0] = 0;
	}
	
}