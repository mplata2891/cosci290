/*
  Mike Plata
  CoSci 290
  
  Demo on the String class
*/

import java.util.Scanner;
public class TestStrings{

  //main method
  public static void main(String[] args){
    
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    //ask the user a question
    System.out.println("Are you rich?");
    
    //get answer from console
    String answer = input.next();
    
    int nameLength = 0;
    boolean flag = false;
    
    //example of a while loop
    while(nameLength < 2 && !flag){
      System.out.println("What is your name?");
    
      /*
        Impose some rules on user input
        str.length() - gives an int of how many characters the String is long
      */
      
      answer = input.next();

      if(answer.length() < 2){
        System.out.println("Please enter in a name that is at least"
                          + " two characters long and no numbers.");
      }
      else{ //name is at least 2 characters
        //check if name contains letters
        
        //for example, go through each letter is the name Logan
        //str.charAt(0) to look at the character in index 0
        
        //use a for-loop becaue we know how many letters it has
        for(int index = 0; index < answer.length(); index++){
          
          //check if the characcter is a letters
          if(!Character.isLetter(answer.charAt(index))){
            flag = true;
            break;//gets out of current loop
          }
        }
        
      }
      
      nameLength = answer.length();
      }//end while loop
    
    /*
      do{
      
        the body with code.the
        . . .
        
        
      }while(some condition)
    */
    
    answer = input.next();
    
    /*
      str.toLowerCase() - makes all letters lowercase
      str.toUpperCase() -- makes all letter uppercase
      str.equals("some other string") - checks if two Strings are exactly the same
      str.equalsIgnoreCase("no") - checks if two String are equal regardless of case
      
    */
    
    
    
    if(answer.equalsIgnoreCase("no")){
      System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool");
    }
    
  }
}