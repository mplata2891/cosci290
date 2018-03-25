/*
  Mike Plata
  CoSci290
*/

import java.util.ArrayList;
public class Student extends Person{

  //Student has 4 inherited fields from Person
  //firstName, lastName, age, & Gender

  //Student has 3 class members/fields
  private String major;
  private double gpa;
  private ArrayList<String> classes;

  //default constructor
  public Student(){

    //sets the indicated string as the value of the major fields
    this.major = "Computer Science";

    //sets the value of the gpa field to the given value
    this.gpa = 3.2;

    //creates a new array of type String and assigns it to the
    //classes field
    this.classes = new ArrayList<>();
  }

  //method to return the value of the major field
  public String getMajor(){

    //returns the value of the major field
    return this.major;
  }

  //method to set the value of the major field
  public void setMajor(String newMajor){

    //sets the value of newMajor to the major field
    this.major = newMajor;
  }

  //method to return the value of the gpa field
  public double getGpa(){

    //returns the value of the gpa field
    return this.gpa;
  }

  //method to set the value of the gpa field
  public void setGpa(double newGpa){

    //sets the value of newGpa to the gpa field
    this.gpa = newGpa;
  }

  //method to return the value of the classes field
  public ArrayList<String> getClasses(){

    //returns the value of the classes field
    return this.classes;
  }

  //method to set the value of the classes field
  public void setClasses(String newClass){

    //adds the value of newClass to a new index at
    //the end of the ArrayList
    classes.add(newClass);
  }

  //method to create a string representation of
  //Student for printing purposes
  public String toString(){

    //returns string representation of Student
    return "Student - \n"
            + "First Name: " + super.getFirstName() + "\n"
            + " Last Name: " + super.getLastName() + "\n"
            + "       Age: " + super.getAge() + "\n"
            + "    Gender: " + super.getGender() + "\n"
            + "     Major: " + this.major + "\n"
            + "       GPA: " + this.gpa + "\n";
  }
}
