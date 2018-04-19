/*
  Mike Plata
  CoSci 290

  This Utility class houses all the custom methods
  that support my text adventure

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utility{

  /*
    This method opens a file and prints out each line
  */
  public void readFile(String filename){

    String currentLine; //hold current line being read in File

    //trying to open a file to read
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        System.out.println(currentLine);
      }

      //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  public void splashPageTitle(){

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
  }

  public void splashPageGameOver(){

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

  public void writeFile(String filename, String content) {

  	try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

  		bw.write(content);

  		System.out.println("Done");

  	} catch (IOException e) {

  		e.printStackTrace();

  	}

  }

}
