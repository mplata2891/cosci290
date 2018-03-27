/*
  Mike Plata
  CoSci290
*/

import java.util.*;
public class Tester{

  public static void main(String[] args){

    //declare and initialize ArrayList
    ArrayList<Student> listOfStudents = new ArrayList<>();

    //declare and initialize array
    Student[] list = new Student[5];

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
