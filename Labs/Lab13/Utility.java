/*
  Mike Plata
  CoSci 290

  This Utility class houses all the custom methods
  that support my text adventure

*/

//declare imports
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utility{

  //This method opens a file and prints out each line
  public void readFile(String filename){

    String currentLine; //hold current line being read in File

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
        System.out.println(currentLine);
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
  }//end readFile

  //method to write content into a file
  public void writeFile(String filename, String content) {

    //try to open a file to write to
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

      //write's the value of content to a text file
      bw.write(content);

      //prints done when file has been written to
      System.out.println("Done");

  	} catch (IOException e) {

  		e.printStackTrace();
  	}//end try-catch
  }//end writeFile

  //method to print the title of text adventure to screen
  public void splashPageTitle(){

    //prints splash page
    System.out.println("@@@        @@@@@@    @@@@@@   @@@@@@@ \n"
				        +"@@@       @@@@@@@@  @@@@@@@   @@@@@@@  \n"
				        +"@@!       @@!  @@@  !@@         @@!    \n"
				        +"!@!       !@!  @!@  !@!         !@!    \n"
				        +"@!!       @!@!@!@!  !!@@!!      @!!    \n"
        				+"!!!       !!!@!!!!   !!@!!!     !!!    \n"
        				+"!!:       !!:  !!!       !:!    !!:    	\n"
        				+" :!:      :!:  !:!      !:!     :!:    \n"
        				+" :: ::::  ::   :::  :::: ::      ::    \n"
        				+": :: : :   :   : :  :: : :       :     \n"


				        +"@@@        @@@@@@   @@@  @@@   @@@@@@@@  @@@  @@@  \n"
				        +"@@@       @@@@@@@@  @@@  @@@  @@@@@@@@@  @@@  @@@  \n"
				        +"@@!       @@!  @@@  @@!  @@@  !@@        @@!  @@@  \n"
				        +"!@!       !@!  @!@  !@!  @!@  !@!        !@!  @!@  \n"
				        +"@!!       @!@!@!@!  @!@  !@!  !@! @!@!@  @!@!@!@!  \n"
				        +"!!!       !!!@!!!!  !@!  !!!  !!! !!@!!  !!!@!!!!  \n"
				        +"!!:       !!:  !!!  !!:  !!!  :!!   !!:  !!:  !!!  \n"
				        +" :!:      :!:  !:!  :!:  !:!  :!:   !::  :!:  !:!  \n"
				        +" :: ::::  ::   :::  ::::: ::   ::: ::::  ::   :::  \n"
				        +": :: : :   :   : :   : :  :    :: :: :    :   : :  \n");
  }//end splashPageTitle

  //method to print a Game Over message to screen
  public void splashPageGameOver(){

    //prints Game Over message
    System.out.println("Wrong Move.\n"
                      +  " _______  _______  _______  _______    _______           _______  _______ \n"
                      +  "(  ____ \\(  ___  )(       )(  ____ \\  (  ___  )|\\     /|(  ____ \\(  ____ )\n"
                      +  "| (    \\/| (   ) || () () || (    \\/  | (   ) || )   ( || (    \\/| (    )|\n"
                      +  "| |      | (___) || || || || (__      | |   | || |   | || (__    | (____)|\n"
                      +  "| | ____ |  ___  || |(_)| ||  __)     | |   | |( (   ) )|  __)   |     __)\n"
                      +  "| | \\_  )| (   ) || |   | || (        | |   | | \\ \\_/ / | (      | (\\ (   \n"
                      +  "| (___) || )   ( || )   ( || (____/\\  | (___) |  \\   /  | (____/\\| ) \\ \\__\n"
                      +  "(_______)|/     \\||/     \\|(_______/  (_______)   \\_/   (_______/|/   \\__/\n");
  }//end splashPageGameOver

  public String takeName(){

    boolean inputIsValid = false;
    String input = "";

    do{

      System.out.print("Please Enter a Name: ");

      input = this.getString();

      inputIsValid = this.isNameValid(input);

      if(inputIsValid == false){

        this.nameErrorMsg();
      }
    }while(inputIsValid == false);

    return input;
  }//end getName

  public String getString(){

    String newString = "";

    Scanner input = new Scanner(System.in);

    newString = input.next();

    return newString;
  }//end getInput

  public boolean isNameValid(String value){

    boolean validFlag = false;

    if(value != ""){

      for(int i = 0; i < value.length(); i++){

        //check if the characcter is a letter or a number
        if(Character.isLetterOrDigit(value.charAt(i))){

          validFlag = true;
        }
        else{

          validFlag = false;

          return validFlag;
        }//end if-else
      }//end for
    }//end if

    return validFlag;
  }//end isNameValid

  public void nameErrorMsg(){

    System.out.println("The name you entered was not valid.\n"
                        + "Please enter a name that has at least\n"
                        + "one character, and is comprised of only\n"
                        + "letters and numbers.\n"
                        + "Please try again.\n\n");
  }//end nameErrorMsg

}// end class
