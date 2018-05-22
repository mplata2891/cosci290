/*
  Mike Plata
  CoSci 290
*/

//begin new class
public class UndeadMage extends Undead{

  //the UndeadMage class has 2 class members/fields/properties
  private String spellOne;
  private String spellTwo;

  //default constructor
  public UndeadMage(){

    //invoke the parent class default constructor
    super();

    //invoke the parent class setName method
    super.setName("Undead Mage");

    //assign the given string to the spellOne field
    this.spellOne = "*** Necrotic Touch ***";

    //assign the given string to the spellTwo field
    this.spellTwo = "^^^ Undead Fire ^^^";
  }//end constructor



  //method to get the value of the spellOne field
  public String getspellOne(){

    //returns the value of the spellOne field
    return this.spellOne;
  }//end getspellOne



  //method to set the value of the spellOne field
  public void setSpellOne(String newSpell){

    //assigns the value of newSpell to the spellOne field
    this.spellOne = newSpell;
  }//end setSpellOne



  //method to get the value of the spellOne field
  public String getSpellTwo(){

    //returns the value of the spellTwo field
    return this.spellTwo;
  }//end getSpellTwo



  //method to set the value of the spellTwo field
  public void setSpellTwo(String newSpell){

    //assigns the value of newSpell to the spellTwo field
    this.spellTwo = newSpell;
  }//end setSpellTwo



  //method to print out how an instance of this class would 'attack'
  public void attack(int attack){

    //prints attack notification to the user
    System.out.print(super.getName() + " attacks with ");

    //initiate if-else statement
    if((attack % 2) == 0)
      System.out.println(this.spellOne + "\n");//prints attack method
    else
      System.out.println(this.spellTwo + "\n");//prints attack method
  }//end attack



  //method to return the object represented as a string with labels for each field
  public String toString(){

      return super.toString()
              + "Spell One: " + this.spellOne + "\n"
              + "Spell Two: " + this.spellTwo + "\n";
  }//end toString

}//end class
