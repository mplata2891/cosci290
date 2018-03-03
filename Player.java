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

  //the Player class has 21 properties
  private String firstName;
  private String lastName;
  private int age;
  private String playerType;
  private int level;
  private int experience;
  private int hitPoints;
  private int strength;
  private int toughness;
  private int intelligence;
  private int attackModifier;
  private int defenseModifier;
  private int skillModifier;
  private Weapon weapon;
  private Armor armor;
  private Item itemOne;
  private Item itemTwo;
  private Item itemThree;
  private int totalAttack;
  private int totalDefense;
  private int totalSkill;
  
  /*
    The Player class has one constructor that sets the values for
    the following properties:
        firstName
        lastName
        playerType
        age
        level
        experience
  */
  public Player(String first, String last, String type, int years, Weapon weapon,
               + Armor armor, Item item){
    
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
    
    //sets the Player Level that the player starts at by assigning the value
    //one (1) to the level property
    this.level = 1;
    
    //sets the Experience Points the player starts with by assigning the value
    //zero (0) to the experience property
    this.experience = 0;
  }
  
  /*
    The Player class has 7 public methods
  */
  
  //method to assign a value to the firstName property
  public void setFirstName(String newFirstName){
    
    //assigns the value of newFirstName to firstName
    this.firstName = newFirstName;
  }
  
  //method to return the value of the firstName property
  public String getFirstName(){
    
    //retrurns the value of the firstName property
    return this.firstName;
  }
  
  //method to assign a value to the lastName property
  public void setLastName(String newLastName){
    
    //assigns the value of newLastName to lastName
    this.lastName = newLastName;
  }
  
  //method to return the value of the lastName property
  public String getLastName(){
    
    //retrurns the value of the lastName property
    return this.lastName;
  }
  
  //method to assign a value to the playerType property
  public void setPlayerType(String newType){
    
    //assigns the value of newType to playerType
    this.playerType = newType;
  }
  
  //method to return the value of the playerType property
  public String getPlayerType(){
    
    //retrurns the value of the playerType property
    return this.playerType;
  }
  
  //method to assign a value to the age property
  public void setAge(int years){
    
    //assigns the value of years to age
    this.age = years;
  }
  
  //method to return the value of the age property
  public int getAge(){
    
    //retrurns the value of the age property
    return this.age;
  }
  
  //method to assign a value to the level property
  public void setLevel(int newLevel){
    
    //assigns the value of newLevel to level
    this.level = newLevel;
  }
  
  //method to return the value of the level property
  public int getLevel(){
    
    //retrurns the value of the level property
    return this.level;
  }
  
  //method to assign a value to the experience property
  public void setExperience(int newExperience){
    
    //assigns the value of newExperience to experience
    this.experience = newExperience;
  }
  
  //method to return the value of the experience property
  public int getExperience(){
    
    //retrurns the value of the experience property
    return this.experience;
  }
  
  //method to assign a value to the hitPoints property
  public void setHitPoints(int newHp){
    
    //assigns the value of newHp to hitPoints
    this.hitPoints = newHp;
  }
  
  //method to return the value of the hitPoints property
  public int getHitPoints(){
    
    //retrurns the value of the hitPoints property
    return this.hitPoints;
  }
  
  //method to assign a value to the strength property
  public void setStrength(int newValue){
    
    //assigns the value of newValue to strength
    this.strength = newValue;
    
    //calls setAttackMod method
    setAttackMod(this.strength);
  }
  
  //method to return the value of the strength property
  public int getStrength(){
    
    //retrurns the value of the strength property
    return this.strength;
  }
  
  //method to assign a value to the toughness property
  public void setToughness(int newValue){
    
    //assigns the value of newValue to toughness
    this.toughness = newValue;
    
    //calls setDefenseModifier method
    setDefenseModifier(this.toughness);
  }
  
  //method to return the value of the toughness property
  public int getToughness(){
    
    //retrurns the value of the toughness property
    return this.toughness;
  }
  
  //method to assign a value to the intelligence property
  public void setIntelligence(int newValue){
    
    //assigns the value of newValue to intelligence
    this.intelligence = newValue;
    
    //calls setSkillModifier method
    setSkillModifier(this.intelligence);
  }
  
  //method to return the value of the intelligence property
  public int getIntelligence(){
    
    //retrurns the value of the intelligence property
    return this.intelligence;
  }
  
  //method to compute the modifier of a player's attribute,
  //i.e. the bonus a player receives from strength, toughness,
  //and intelligence
  private protected int computeModifier(int attributeValue){
    
    //returns the value of the calculation
    return ((attributeValue - 10) / 2);
  }
  
  //method to assign a value to the attackModifier property
  private protected void setAttackModifier(int newValue){
    
    //calls the computeModifier method, passing the value of
    //newValue. value returned by method is assigned to attackModifier
    this.attackModifier = computeModifier(newValue);
    
    //calls the setTotalAttack method
    setTotalAttack(this.weapon.atkMod, this.attackModifier);
  }
  
  //method to return the value of the attackModifier property
  public int getAttackModifier(){
    
    //retrurns the value of the attackModifier property
    return this.attackModifier;
  }
  
  //method to assign a value to the defenseModifier property
  private protected void setDefenseModifier(int newValue){
    
    //calls the computeModifier method, passing the value of
    //newValue. value returned by method is assigned to defenseModifier
    this.defenseModifier = computeModifier(newValue);
    
    //calls the setTotalDefense method
    setTotalDefense(this.defenseModifier);
  }
  
  //method to return the value of the defenseModifier property
  public int getDefenseModifier(){
    
    //retrurns the value of the defenseModifier property
    return this.defenseModifier;
  }
  
  //method to assign a value to the skillModifier property
  private protected void setSkillModifier(int newValue){
    
    //calls the computeModifier method, passing the value of
    //newValue. value returned by method is assigned to skillModifier
    this.skillModifier = computeModifier(newValue);
    
    //calls the setTotalSkill method
    setTotalSkill(this.skillModifier);
  }
  
  //method to return the value of the skillModifier property
  public int getSkillModifier(){
    
    //retrurns the value of the defenseModifier property
    return this.skillModifier;
  }
  
  //method to assign a value to the weapon property
  public void setWeapon(Weapon currentWeapon, Weapon newWeapon){
    
    //calls unequipCurrentWeapon method
    unequipCurrentWeapon(currentWeapon.atkMod, this.attackModifier);
    
    //calls equipNewWeapon method
    equipNewWeapon(newWeapon.atkMod, this.attackModifier);
  }
  
  //method for removing the current weapon's attack modifier value (weapon.atkMod)
  //from the value of the totalAttack property
  private protected void unequipCurrentWeapon(int currentWeaponAtk, int atkMod){
    
    //calls the setTotalAttack method
    setTotalAttack(-currentWeaponAtk, atkMod);
  }
  
  //method for adding the new weapon's attack modifier value (weapon.atkMod)
  //to the value of the totalAttack property
  private protected void equipNewWeapon(Weapon newWeapon, int newWeaponAtk, int atkMod){
    
    //assigns the value of newWeapon to weapon
    this.weapon = newWeapon;
    
    setTotalAttack(newWeaponAtk, atkMod);
  }
  
  //method to return the value of the weapon property
  public void getWeapon(){
    
    //returns the value of the weapon property
    return this.weapon;
  }
  
  //method to assign a value to the armor property
  public void setArmor(Armor currentArmor, Armor newArmor){
    
    //calls unequipCurrentArmor method
    unequipCurrentArmor(currentArmor.defMod, this.defenseModifier);
    
    //calls equipNewArmor method
    equipNewArmor(newArmor.defMod, this.defenseModifier);
    
    //assigns the value of newArmor to armor
    this.armor = newArmor;
  }
  
  //method for removing the current armor's defense modifier value (armor.defMod)
  //from the value of the totalDefense property
  private protected void unequipCurrentArmor(int currentArmorDef, int defMod){
    
    //calls the setTotalDefense method
    setTotalDefense(-currentArmorDef, defMod);
  }
  
  //method for adding the new armor's defense modifier value (armor.defMod)
  //to the value of the totalDefense property
  private protected void equipNewArmor(int newArmorDef, int defMod){
    
    setTotalArmor(newArmorDef, defMod);
  }
  
  //method to return the value of the armor property
  public void getArmor(){
    
    //returns the value of the armor property
    return this.armor;
  }
  
  //method to assign a value to the itemOne property
  public void setItemOne(Item oldItem, Item newItem){
    
    //assigns the value of newItem to itemOne
    this.itemOne = newItem;
  }
  
  //method to return the value of the itemOne property
  public void getItemOne(){
    
    //returns the value of the itemOne property
    return this.itemOne;
  }
  
  //method to assign a value to the itemTwo property
  public void setItemTwo(Item oldItem, Item newItem){
    
    //assigns the value of newItem to itemTwo
    this.itemTwo = newItem;
  }
  
  //method to return the value of the itemTwo property
  public void getItemTwo(){
    
    //returns the value of the itemTwo property
    return this.itemTwo;
  }
  
  //method to assign a value to the itemThree property
  public void setItemThree(Item oldItem, Item newItem){
    
    //assigns the value of newItem to itemThree
    this.itemThree = newItem;
  }
  
  //method to return the value of the itemThree property
  public void getItemThree(){
    
    //returns the value of the itemThree property
    return this.itemThree;
  }
  
  private protected void setTotalAttack(int weaponAttack, int attackMod){
    
    this.totalAttack = weaponAttack + attackMod;
  }
  
  private protected void setTotalDefense(int armorDefense, int defenseModifier){
    
    this.totalDefense = armorDefense + defenseModifier;
  }
  

}