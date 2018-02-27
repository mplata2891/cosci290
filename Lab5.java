/*
  Mike Plata
  CoSci 290
*/

import java.util.Scanner;
public class Lab5{
  
  public static void main(String[] args){
    
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    //variable declaration
    String name;
    int nameLength;
    boolean nameHasNumbers;
    
    //enter while loop
    do{
      nameLength = 0;
      
      nameHasNumbers = true;
      
      System.out.println("What is your name?");//ask user their name
      
      name = input.next();//extract input from user and save into 'answer'
      
      nameLength = name.length();
      
      for(int index = 0; index < nameLength; index++){
          
          //check if the character is a letter
          if(!Character.isLetter(name.charAt(index))){
            System.out.println("Please enter in a name that contains"
                              + " only letters.");
            break;
          }
        
          if(index == (nameLength - 1)){
            nameHasNumbers = false;
          }
        }
      
      if(nameLength < 2){
        System.out.println("Please enter in a name that is at least"
                          + " two characters long.");
      }
      
     }while(nameLength < 2 || nameHasNumbers);
   }
 }