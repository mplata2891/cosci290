/*
  Mike Plata
  CoSci 290
*/

//delare imports
import java.util.ArrayList;

//begin new test class
public class UndeadDriver{

  //entry point of application
  public static void main(String[] args){

    //instantiate a new ArrayList of type Undead and assing it to deadBodies
    ArrayList<Undead> deadBodies = new ArrayList<>();

    //declare and initialize variables
    int controller = 0;

    //initiate for loop to iterate through List
    for(int i = 0; i < 10; i++){

      //invokes chance method and assigns its return value to controller
      controller = chance(0,9);

      //initiate if-else statement
      if((controller % 2) == 0)
        //instantiate new object of type UndeadMage and add to List
        deadBodies.add(new UndeadMage());
      else
        //instantiate new object of type UndeadMage and add to List
        deadBodies.add(new UndeadWarrior());
    }//end for

    //initiate for loop to iterate throuh List
    for(int i = 0; i < 10; i++){

      //invokes chance method and assigns its return value to controller
      controller = chance(0,9);

      //get object stored in index of List and invoke attack method
      deadBodies.get(i).attack(controller);

      //go the next line on screen
      System.out.println();
    }//end for

  }//end main

  //gives random int in a given interval
  public static int chance(int start, int end){

    //retuns random value between 0 and 9
    return start + (int)(Math.random() * (end - start));
  }//end chance

}//end class
