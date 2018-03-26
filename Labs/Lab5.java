/*
  Mike Plata
  CoSci 290
  Lab05

  Lab 05 Directions: Fix the following application to take user input that
                    requires the user to enter in a name that must be at least
                    2 characters long and must only have letters.

Edited on 3/25 to add comments. -MP                    
*/

import java.util.Scanner;
public class Lab5{

  //entry point or application
  public static void main(String[] args){

    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);

    //variable declaration
    String name;
    int nameLength;
    boolean nameHasNumbers;

    //enter while loop
    do{
      nameLength = 0;//assign a value to nameLength

      nameHasNumbers = true;//assign a value to nameHasNumbers

      System.out.println("What is your name?");//ask user their name

      name = input.next();//extract input from user and save into 'answer'

      nameLength = name.length();//assign a new value to nameLength

      //enter for loop
      for(int index = 0; index < nameLength; index++){

          //check if the character is a letter
          if(!Character.isLetter(name.charAt(index))){

            //print message to user
            System.out.println("Please enter in a name that contains"
                              + " only letters.");

            break;//breaks out of loop
          }

          //enters if statement if condition is true
          if(index == (nameLength - 1)){
            nameHasNumbers = false;//assigns a new value to nameHasNumbers
          }
        }

      //enters if statement if condition is true
      if(nameLength < 2){

        //prints out message to user
        System.out.println("Please enter in a name that is at least"
                          + " two characters long.");
      }

    }while(nameLength < 2 || nameHasNumbers);//continues to loop if condition is true
   }
 }
