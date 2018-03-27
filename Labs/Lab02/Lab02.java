/*
  Mike Plata
  CoSci 290
  Lab 01

  Lab 01 Instructions: Based on the lecture/demo on 02/15/18, use Scanner to
                      prompt the user for 3 to 4 questions that would set up
                      the start of your text adventure.

  Testing Input and Output for end of semester project
 */

import java.util.Scanner;
public class Lab02{

  //entry point of main application
  public static void main(String[] args){

    //initialize and declare needed variables
    String choice = "yes";
    String direction = "forward";
    String name = "playerOne";
    int age = 0;

    //instantitate and declare new object of type Scanner
    Scanner input = new Scanner(System.in);

    //print message to the user and prompt for input
    System.out.println("Hello player, are you ready to tempt fate, and get lost in the labyrinth?\n"
                       + "You'll have challenges to face in every ROOMCAVE and encounter deadly\n"
                       + "Post Apolcalyptic Cyberpunk Clowns.\n\n"
                       + "Yes or No: ");

    //extract input from the user
    choice = input.next();

    //prompt user for input
    System.out.println("Good, Good! Do you have a name? Tell it to me: ");

    //extract input from the user
    name = input.next();

    //prompt user for input
    System.out.println("How old are you " + name + "? Tell me: ");

    //extract input from the user
    age = input.nextInt();

    //print message to the user
    System.out.println(age + "? Quite appropriate. " + name + ", prepare to enter. . . and struggle to escape!");

    //print message to the user and prompt for input
    System.out.println("You find yourself in a dimly lit ROOMCAVE. In which direction do you choose to move?\n"
                       + "Forward, Left, Right, or Backward? Enter your choice: ");

    //extract input from the user
    direction = input.next();

    //print message to user
    System.out.println("You chose " + direction + ". Unfortunately you have been eaten alive by a SignLanguage Monster.\n"
                       + "Goodbye!");

  }
}
