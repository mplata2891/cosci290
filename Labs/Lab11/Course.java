/*
  Mike Plata
  CoSci 290
  Midterm
  
  Continuing your last lab, create a custom class called Course with the following attributes
    -Name
    -Units
  
  Next modify your Student class to have a list of Courses instead. In your test program, 
  declare 5 Student objects (fill in random values for attributes) and put them in a list.
  Be sure to iterate through the list and print out each Student and information on all 
  their attributes.

  Remember all custom classes/objects must have at least the following:

  class attributes that are private
  a zero-argument constructor that gives default values to class attributes
  getters and setters for each class attribute
  a toString method that displays each attribute
*/

public class Course{
  
  //the class Course has 2 class members/fields
  private String name;
  private int units;
  
  //defualt constructor
  public Course(){
    
    //sets the value of the name field to the indicated string
    this.name = "Unknown";
    
    //sets the value of the units field to the given value
    this.units = 0;
  }
  
  //method to return the value of the name field
  public String getName(){
    
    //returns the value of the name field
    return this.name;
  }
  
  //method to set the value of the name field
  public void setName(String newName){
    
    //sets the value of newName to the namd field
    this.name = newName;
  }
  
  //method to return the value of the units field
  public int getUnits(){
    
    //returns the value of the units field
    return this.units;
  }
  
  //method to set the valud of the units field
  public void setUnits(int newUnits){
    
    //sets the value of newUnits to the units field
    this.units = newUnits;
  }
  
  //method to return the object represented as a String
  //with appropriate labels for each field
  public String toString(){
    
    //returns the following string
    return "Course -\n"
            + " Name: " + this.name + "\n"
            + "Units: " + this.units + "\n\n";
  }  
}