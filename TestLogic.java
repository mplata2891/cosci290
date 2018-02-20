/*
  Mike Plata
  CoSci 290
  
  Topics:
    -multi-way if-else
    -logical operators
    -symbolic logical
 */

import java.util.Scanner;
public class TestLogic{
  
  //entry point of application
  public static void main(String[] args){
    
    //setting up scanner for user input
    Scanner input = new Scanner(System.in);
    
    //prompt the user to enter in a gradee
    System.out.println("Enter a Grade: ");
    
    int grade = 73;
    
    grade = input.nextInt();
      
      //simple if
      if(grade >= 90){
        System.out.println("A");
    }
    
    //two-way if-else
    if(grade < 90){
      System.out.println("grade is not an A");
    }
    else{
      System.out.println("grade is an A");
    }
    
    //multi if-elseif-else
    if(grade >=90){
      System.out.println("A");
    }
    else if(grade >= 80){
      System.out.println("B");
    }
    else if(grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
    
    /*
      Logical operators
      
      ! - NOT
      != NOT equal to
      == IS equal to
      && - AND
      || - OR
    */
    
    /*
      Symbolic Logic with Java Logical Operators
      
      && => if both or (all) conditions are true, then the conditional evaluates to true
        p = true
        q = true
        
        [p && q] = true because both conditions are true, if q is false, then it evaluates to false
      
      || => if either condition is true, then the conditional evaluates to true
        p = false
        q = true
        [p || q] = true because at least one condition is true, if q is false, then it evaluates to false
    */
    
    //using if-else, write code that checcks whether
    //a student grade is good, average, or bad
    if(grade >= 80){
      System.out.println("Your grade is good.");
      
      //nested-if
      if(grade >= 90){
        System.out.println("Wow you got an A.");
      }
      
    }
    else if(grade < 80 && grade >= 70){
      System.out.println("Your grade is average.");
    }
    else{
      System.out.println("Your grade is bad.");
    }
    
    
  }
}