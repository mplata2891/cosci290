/*
  Mike Plata
  CoSci290
*/

import java.util*;
pulbic class Tester{

  public static void main(String[] args){

    //declare and initialize ArrayList
    ArrayList<Student> listOfStudents = new ArrayList<>();

    //declare and inititlaize array
    Student[] list = new Student[5];

    //initiate for loop to instantiate Student objects
    for(int i = 0; i < 5; i++){

      //instantiates a new object of Type student
      //and strores it in the array
      list[i] = new Student();
    }

    //initiatie for loop to store objects from array to ArrayList
    for(int i = 0; i < 5; i++){

      //stores objects in ArrayList from array
      listOfStudents.add(list[i]);
    }

    //inititate for loop to print out objects stored in ArrayList
    for(int i = 0; i < 5; i++){

      //prints out object in given index of array
      listOfStudents.get(i).toString();

      //goes to new line
      System.out.println("");
    }
  }
}