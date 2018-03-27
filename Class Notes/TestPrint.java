/*
  Mike Plata
  CoSci 290
  Testing different print examples + Lab 01

  In class notes, testing different print examples with cancatonation,
  numbered constants, operations and the escapre character.

  Lab 01 Instructions: Go to http://www.network-science.de/ascii/
                      (Links to an external site.)Links to an external site
                      and create ascii art as a splash screen for your text
                      adventure. Based on the demo/lecture, print out your
                      ascii art to the console.

  Edited on 3/25 by adding comments. -MP

  This application is a demo to test different
  printout statements.
*/

public class TestPrint{

  //main method, where the application starts
  public static void main(String[] args){

    //7 different types of print statements
    System.out.println("cat");
    System.out.println(2 + 2);
    System.out.println("cat" + 2);
    System.out.println("cat" + 2 + 'c');
    System.out.println(2 + 'c' + "cat");
    System.out.print("'S\n");
    System.out.println("Hello \n World!");

    //This is Lab 01, the splash screen for our text adventure.
    System.out.println(" ._.___________                                 ._. \n"
                      +" | |\\_   _____/ ______ ____ _____  ______   ____| | \n"
                      +" | | |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ | \n"
                      +"  \\| |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\| \n"
                      +"  __/_______  /____  >\\___  >____  /   __/ \\___  >_ \n"
                      +"  \\/        \\/     \\/     \\/     \\/|__|        \\/\\/ \n");
  }

}
