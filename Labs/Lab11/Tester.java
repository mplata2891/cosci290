/*
  Mike Plata
  CoSci290
*/

import java.util.*;
public class Tester{

  //entry point of application
  public static void main(String[] args){

    //declare and initialize ArrayList of type Student
    ArrayList<Student> listOfStudents = new ArrayList<>();

    //declare and initialize array of type Student
    Student[] list = new Student[5];

    //instantiate and declare new object of type Course
    Course defaultCourse = new Course();

    //declare and initialize needed variables
    double j = 0.0;

    //initiate for loop to instantiate Student objects
    for(int i = 0; i < 5; i++){

      //instantiates a new object of Type student
      //and stores it in the array
      list[i] = new Student();
    }

    //initiate for loop to store objects from array to ArrayList
    for(int i = 0; i < 5; i++){

      //stores objects in ArrayList from array
      listOfStudents.add(list[i]);

      //add defaultCourse to the Student classes field
      listOfStudents.get(i).setClasses(defaultCourse);

      //set a new value for the Student gpa field
      listOfStudents.get(i).setGpa(j++);
    }

    //initiate for loop to print out objects stored in ArrayList
    for(int i = 0; i < 5; i++){

      //prints out object in given index of array
      System.out.println(listOfStudents.get(i).toString());

      //goes to new line
      System.out.println("");
    }
  }
}
