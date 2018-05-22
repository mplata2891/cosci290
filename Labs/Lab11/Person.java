/*
  Mike Plata
  CoSci290

  Lab

  Create a custom class called Person with the following attributes
  First Name
  Last Name
  Age
  Gender

  Create a subclass of Person called Student with the following attributes
  Major
  GPA
  List of names of classes

  Create a test program/class that has a list of 5 Student objects and prints out
  each student information including their name, age, and gender.
*/

public class Person{

  //Person has 4 class members/fields
  private String firstName;
  private String lastName;
  private int age;
  private String gender;

  //default constructor
  public Person(){

    //sets the indicated string as the value of the firstName field
    this.firstName = "Joe";

    //sets the indicated string as the value of the lastName field
    this.lastName = "Cipher";

    //sets the value of the age field to the given value
    this.age = 23;

    //sets the indicated string as the value of the gender field
    this.gender = "Unknown";
  }

  //method to return the value of the firstName field
  public String getFirstName(){

    //returns the value of the firstName field
    return this.firstName;
  }

  //method to set the value of the firstName field
  public void setFirstName(String newName){

    //sets the value of newName to the firstName field
    this.firstName = newName;
  }

  //method to return the value of the lastName field
  public String getLastName(){

    //returns the value of the LastName field
    return this.lastName;
  }

  //method to set the value of the lastName field
  public void setLastName(String newName){

    //sets the value newName to the lastName field
    this.lastName = newName;
  }

  //method to return the value of the age field
  public int getAge(){

    //returns the value of the age field
    return this.age;
  }

  //method to set the value of the age field
  public void setAge(String newAge){

    //sets the value of newAge to the age field
    this.firstName = newAge;
  }

  //method to return the value of the gender field
  public String getGender(){

    //returns the value of the gender field
    return this.gender;
  }

  //method to set the value of the gender field
  public void setGender(String newGender){

    //sets the value newGender to the gender field
    this.gender = newGender;
  }

  //method to create a string representation of
  //Person for printing purposes
  public String toString(){

    //retruns string representation of Person
    return "Person - \n"
            + "First Name: " + this.firstName + "\n"
            + " Last Name: " + this.lastName + "\n"
            + "       Age: " + this.age +  "\n"
            + "    Gender: " + this.gender + "\n\n";
  }
}
