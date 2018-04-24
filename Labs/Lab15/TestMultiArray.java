/*
  Mike Plata
  CoSci 290

  Application to test instantiation and implementation
  of multidimensional array
*/

//new test class
public class TestMultiArray{

    //entry point of application
    public static void main(String[] args){

      //declare a new two dimensional array
      int[][] table = new int[5][5];

      //initiate for loop  for iteration through table rows
      for(int i = 0; i < 5; i++){

        //initiate for loop for iteration through table columns
        for(int j = 0; j < 5; j++){

          //assigns a random int to the indicated index by calling the randomInt method
          table[i][j] = randomInt();
        }
      }

      //initiate for loop for iteration through table rows
      for(int i = 0; i < 5; i++){

        //initiate for loop for iteration through table columns
        for(int j = 0; j < 5; j++){

          //print to screen the indicated table index
          System.out.print(table[i][j] + " ");
        }

        //go to new line
        System.out.print("\n");
      }
    }

    //method for generating a random integer from 1 to 100
    public static int randomInt(){

      //declare and initialize variables
      int minimum = 1;
      int maximum = 100;

      //return random integer from 1 to 100
      return(minimum + (int)(Math.random() * maximum));
    }
}
