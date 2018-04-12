/*
	<<Mike Plata>>
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	        *
	      * * *
	    * * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
	    * * * * *
	      * * *
	        *

  * * * * *
	  * * * *
	    * * *
	      * *
	        *
	4. Fix the indentation of the code.
	Note:
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

public class DebugPractice{

  //entry point of application
  public static void main(String[] args){

    //declare needed variables
    int i, j;

    //enter for loop (1)
    for(i = 1; i <= 5; i++){

      //enter for loop (1a)
      for(j = i; j < 5; j++){

        //prints a space to the screen
        System.out.print(" ");
      }

      //enter for loop (1b)
      for(int k = 1; k < (i * 2); k++){

        //prints an asterisk onto the screen
        System.out.print("*");
      }

      //goes to the new line
      System.out.println();

    }//end of for loop (1)

    //enter for loop (2)
    for(i = 4; i >= 1; i--){

      //enter for loop (2a)
      for(j = 5; j > i; j--){

        //prints a space onto the screen
        System.out.print(" ");
      }

      //enter for loop (2b)
      for(int k = 1; k < (i * 2); k++){

        //prints an asterisk onto the screen
        System.out.print("*");
      }

      //goes to a new line
      System.out.println();

    }//end of for loop (2)

    //goes to a new line - twice
    System.out.print("\n\n");

    //call the printTriangle method
    printTriangle();

  }//end of main method

  //method to print a triangle on to the screen
  public static void printTriangle(){

    //declare needed variables
    int i, j;

    //enter for loop
    for(i = 5; i >= 1; i--){

      //enter for loop (a)
      for(j = 5; j > i; j--){

        //prints a space onto the screen
        System.out.print(" ");
      }

      //enter for loop (b)
      for(int k = 0; k < i; k++){

        //prints an asterisk onto the screen
        System.out.print("*");
      }

      //goes to a new line
      System.out.println();

    }//end of for loop (2)
  }
}
