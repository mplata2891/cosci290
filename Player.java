/*
  Mike Plata
  CoSci 290
  
  sample class of a Player for our
  text adventure. This is based of
  off a character sheet from the 
  legendary game - Dungeons and Dragons.
  
  creat a toString method() for name
*/

public class Player{

  //the Player class has 15 properties
  private String firstName;
  private String lastName;
  private String playerType
  private int age;
  private int strength;
  private int toughness;
  private int intelligence;
  private int attackModifier;
  private int armorClass;
  private int hitPoints;
  private int lives;
  private String weapon;
  private String armor;
  private String itemOne;
  private String itemTwo;
  private String itemThree;
  
  //the Player class has one constructor
  public Player(String first, String last, String type, int years){
    
    //sets the First Name of the player by assigning the 
    //value of first to the firstName property
    this.firstName = first;
    
    //sets the Last Name of the player by assigning the 
    //value of last to the lastName property
    this.lastName = last;
    
    //sets the Type of Adventurer the player will play as by assigning the 
    //by assigning the value of type to the playerType property
    this.playerType = type;
    
    //sets the Age of the player by assigning the value
    //of years to the age property
    this.age = years;
    
    //sets the Number of Lives the player starts with by assigning the value
    //three (3) to the lives property
    this.lives = 3;
  }
  
  /*
    The Player class has 7 public methods
  */
  
  //method to assign a value to the strength property
  public void setStrength(int newValue){
    
    //assigns the value of newValue to strength
    this.strength = newValue;
    
    setAttackMod();
  }
  
  //method to assign a value to the toughness property
  public void setToughness(int newValue){
    
    //assigns the value of newValue to toughness
    this.toughness = newValue;
  }
  
  //method to assign a value to the intelligence property
  public void setIntelligence(int newValue){
    
    //assigns the value of newValue to intelligence
    this.intelligence = newValue;
  }
  
  //method to assign a value to the weapon property
  public void setWeapon(String newWeapon){
    
    //assigns the value of newWeapon to weapon
    this.weapon = newWeapon;
  }
  
  //method to assign a value to the itemOne property
  public void setItemOne(int newItem){
    
    //assigns the value of newItem to itemOne
    this.itemOne = newItem;
  }
  
  //method to assign a value to the itemTwo property
  public void setItemTwo(int newItem){
    
    //assigns the value of newItem to itemTwo
    this.itemTwo = newItem;
  }
  
  //method to assign a value to the itemThree property
  public void setItemThree(int newItem){
    
    //assigns the value of newItem to itemThree
    this.itemThree = newItem;
  }
  
  /*
    The Player class has 3 private protected methods
  */
  
  //method to assign a value to the attackModifier property
  private protected void setAttackMod(){
    
    //assigns the value of newValue to attackModifier
    this.attackModifier = ( (this.strength - 10) / 2 );
  }
  
  //method to assign a value to the armorClass property
  public void setArmorClass(int newValue){
    
    //assigns the value of newValue to armorClass
    this.armorClass = newValue;
  }
  
  //method to assign a value to the hitPoints property
  public void setHitPoints(int newValue){
    
    //assigns the value of newValue to hitPoints
    this.hitPoints = newValue;
  }
  

}