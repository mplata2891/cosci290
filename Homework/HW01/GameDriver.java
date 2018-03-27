/*
  Mike Plata
  CoSci 290
  HW #1   
*/

import java.util.Scanner; //importing Scanner class

//creates a new class
public class GameDriver{
  
  //starts the application
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in); //object insantiation
    
    //declare and initialize variables
    boolean alive = true;
    String confirmChoice = "choice";
    String command = "command";
    String playerName = "name";
    int playerAge = 0;
    int chanceOfSurvival = 0;
    
    //prints to the screen a splash screen with the title of the game
    System.out.println(" ._.___________                                 ._. \n"
                      +" | |\\_   _____/ ______ ____ _____  ______   ____| | \n"
                      +" | | |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ | \n"
                      +"  \\| |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\| \n"
                      +"  __/_______  /____  >\\___  >____  /   __/ \\___  >_ \n"
                      +"  \\/        \\/     \\/     \\/     \\/|__|        \\/\\/ \n");
    
    //prints to the screen the setup of the game (part of the splash screen)
    System.out.println("\n\nIt was a long restless night. Your dreams were full of shadows\n"
                       + "and unease. As you wake up you realize, to your horror, you're\n"
                       + "not in the cozy room you fell asleep last night. Instead, you find\n"
                       + "yourself on a stiff bunk in a small dark room. The room is not very\n"
                       + "large, and you can see from wall to wall. In the dimly lit corner\n"
                       + "there is a rusty metal door.\n");
    
    System.out.print("\nBefore you proceed, doomed wanderer, what is your name?: "); //prompts the user for input
    
    playerName = input.next(); //extracts input from the user
    
    System.out.print("\nOK " + playerName + ", how old are you?: "); //prompts the user for input
    
    playerAge = input.nextInt(); //extracts input from the user
    
    //sends message to the user
    System.out.println("\n" + playerAge + "? You're just a child! Well, no matter. . . \n"
                      + "Are you ready to put your might and wit to the test?\n"
                      + "Are you ready to ESCAPE!!!???\n");
                      
    System.out.print("Type in Yes or No: "); //prompts the user for input
    
    confirmChoice = input.next(); //extracts input from the user
    
    System.out.println("\nHAHAHAHAHA! You have no choice in this!\n"
                       +"Explore the room, and find an exit. Not everything is what it seems.\n"); //confirms user's choice and begins the game
    
    System.out.println("To move around the room, you may use these commands:\n"
                      +"  North\n"
                      +"  South\n"
                      +"  East\n"
                      +"  West\n");
    
    System.out.print("Command: ");
    
    command = input.next();
    
    System.out.println("\nYou're facing a wall. On the wall there is a rusty switch\n"
                      +"It could be dangerous touching it. Do you pull the switch\n"
                      +"or leave it alone?");
    
    System.out.print("Pull? Yes or No?: ");
    
    confirmChoice = input.next();
    
    chanceOfSurvival = (1 + (int)(Math.random() * (10 - 1)));
    
    if(chanceOfSurvival < 6){
      alive = false;
    }
    
    if(alive == false){
      System.out.println("Wrong Move.\n"
                        +  " _______  _______  _______  _______    _______           _______  _______ \n"
                        +  "(  ____ \\(  ___  )(       )(  ____ \\  (  ___  )|\\     /|(  ____ \\(  ____ )\n"
                        +  "| (    \\/| (   ) || () () || (    \\/  | (   ) || )   ( || (    \\/| (    )|\n"
                        +  "| |      | (___) || || || || (__      | |   | || |   | || (__    | (____)|\n"
                        +  "| | ____ |  ___  || |(_)| ||  __)     | |   | |( (   ) )|  __)   |     __)\n"
                        +  "| | \\_  )| (   ) || |   | || (        | |   | | \\ \\_/ / | (      | (\\ (   \n"
                        +  "| (___) || )   ( || )   ( || (____/\\  | (___) |  \\   /  | (____/\\| ) \\ \\__\n"
                        +  "(_______)|/     \\||/     \\|(_______/  (_______)   \\_/   (_______/|/   \\__/\n");
    }
      else{
        System.out.println("You're still alive, nice.");
      }
        
                       
  }
}