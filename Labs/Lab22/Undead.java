/*
  Mike Plata
  CoSci 290
*/

//begin new class
public abstract class Undead{

  //the undead has 3 class members/fields/properties
  private int health;
  private int experience;
  private String name;

  //defualt constructor
  public Undead(){

    //assigns the given value to the health field
    this.health = 0;

    //assigns the given value to the experience field
    this.experience = 0;

    //assigns the given string to the name field
    this.name = "Undead";
  }//end constructor



  //method for getting the value of the health field
  public int getHealth(){

    //returns the value of the health field
    return this.health;
  }//end getHealth



  //method for setting a value to the health field
  public void setHealth(int newHealth){

    //assigns the value of newHealth to the health field
    this.health = newHealth;
  }//end setHealth



  //method for getting the value of the experience field
  public int getExperience(){

    //returns the value of the experience field
    return this.experience;
  }//end getExperience



  //method for setting the value of the experience field
  public void setExperience(int newExp){

    //assigns the valud of newExp to the experience field
    this.experience = newExp;
  }//end setExperience



  //method for getting the value of the name field
  public String getName(){

    //returns the value of the name field
    return this.name;
  }//end getName



  //method for setting the value of the name field
  public void setName(String newName){

    //assigns the value of newName to the name field
    this.name = newName;
  }//end setName



  //abstract method to print out how an instance of this class would 'attack'
  public abstract void attack(int attack);//end attack



  //method to return the object represented as a string with labels for each field
  public String toString(){

    //returns the following string
    return "Name: " + this.name + "\n"
            + "Health: " + this.health + "\n"
            + "EXP: " + this.experience + "\n";
  }//end toString

}//end class
