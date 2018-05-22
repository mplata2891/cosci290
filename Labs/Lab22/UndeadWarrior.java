/*
  Mike Plata
  CoSci 290
*/

//begin new class
public class UndeadWarrior extends Undead{

  //the UndeadMage class has 2 class members/fields/properties
  private String rightHandWeapon;
  private String leftHandWeapon;

  //default constructor
  public UndeadWarrior(){

    //invoke the parent class default constructor
    super();

    //invoke the parent class setName method
    super.setName("Undead Warrior");

    //assign the given string to the spellOne field
    this.rightHandWeapon = "### Dagger of the Dead ###";

    //assign the given string to the rightHandWeapon field
    this.rightHandWeapon = "!!! Hell Sword !!!";
  }//end constructor



  //method to get the value of the rightHandWeapon field
  public String getRightHandWeapon(){

    //returns the value of the rightHandWeapon field
    return this.rightHandWeapon;
  }//end getRightHandWeapon



  //method to set the value of the rightHandWeapon field
  public void setRightHandWeapon(String newWeapon){

    //assigns the value of newWeapon to the rightHandWeapon field
    this.rightHandWeapon = newWeapon;
  }//end setRightHandWeapon



  //method to get the value of the leftHandWeapon field
  public String getLeftHandWeapon(){

    //returns the value of the leftHandWeapon field
    return this.leftHandWeapon;
  }//end getLeftHandWeapon



  //method to set the value of the leftHandWeapon field
  public void setLeftHandWeapon(String newWeapon){

    //assigns the value of newWeapon to the leftHandWeapon field
    this.leftHandWeapon = newWeapon;
  }//end setLeftHandWeapon



  //method to print out how an instance of this class would 'attack'
  public void attack(int attack){

    //prints attack notification to the user
    System.out.print(super.getName() + " attacks with ");

    //initiate if-else statement
    if((attack % 2) == 0)
      System.out.println(this.rightHandWeapon + "\n");//prints attack method
    else
      System.out.println(this.leftHandWeapon + "\n");//prints attack method
  }//end attack



  //method to return the object represented as a string with labels for each field
  public String toString(){

      return super.toString()
              + "Spell One: " + this.rightHandWeapon + "\n"
              + "Spell Two: " + this.leftHandWeapon + "\n";
  }//end toString

}//end class
