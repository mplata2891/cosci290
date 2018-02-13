/*
  Mike Plata
  CoSci 290
  Lab 01
  
  Testing Input and Output for end of semester project
 */

import java.util.Scanner;
public class Lab01{
  
  public static void main(String[] args){
    
    String choice = "yes";
    String direction = "forward";
    String name = "playerOne";
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hello player, are you ready to tempt fate, and get lost in the labyrinth?\n"
                       + "You'll have challenges to face in every ROOMCAVE and encounter deadly\n"
                       + "Post Apolcalyptic Cyberpunk Clowns.\n\n"
                       + "Yes or No: ");
    
    choice = input.next();
    
    System.out.println("Good, Good! Do you have a name? Tell it to me: ");
    
    name = input.next();
    
    System.out.println("How old are you " + name + "? Tell me: ");
    
    age = input.nextInt();
    
    System.out.println(age + "? Quite appropriate. " + name + ", prepare to enter. . . and struggle to escape!");
    
    System.out.println("You find yourself in a dimly lit ROOMCAVE. In which direction do you choose to move?\n"
                       + "Forward, Left, Right, or Backward? Enter your choice: ");
    
    direction = input.next();
    
    System.out.println("Your chose " + direction + ". Unfortunately you have been eaten alive by a SignLanguage Monster.\n"
                       + "Goodbye!");
    
  }
}
  
  