/*
  Mike Plata
  CoSci 290
      
*/

import java.util.Scanner;
public class GameDriver{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    String confirmChoice = "choice";
    String playerName = "name";
    int playerAge = 0;
    
    
    System.out.println(" ._.___________                                 ._. \n"
                      +" | |\\_   _____/ ______ ____ _____  ______   ____| | \n"
                      +" | | |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ | \n"
                      +"  \\| |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\| \n"
                      +"  __/_______  /____  >\\___  >____  /   __/ \\___  >_ \n"
                      +"  \\/        \\/     \\/     \\/     \\/|__|        \\/\\/ \n");
    
    System.out.println("\n\nIt was a long restless night. Your dreams were full of shadows\n"
                       + "and unease. As you wake up you realize, to your horror, you're\n"
                       + "not in the cozy room you fell asleep last night. Instead, you find\n"
                       + "yourself on a stiff bunk in a small dark room. The room is not very\n"
                       + "large, and you can see from wall to wall. In the dimly lit corner\n"
                       + "there is a rusty metal door.\n");
    
    System.out.print("\nBefore you proceed, doomed wanderer, what is your name?: ");
    
    playerName = input.next();
    
    System.out.print("\nOK " + playerName + ", how old are you?: ");
    
    playerAge = input.nextInt();
    
    System.out.println("\n" + playerAge + "? You're just a child! Well, no matter. . . \n"
                      + "Are you ready to put your might and wit to the test?\n"
                      + "Are you ready to ESCAPE!!!???\n");
                      
    System.out.print("Type in Yes or No: ");
    
    confirmChoice = input.next();
                       
  }
}