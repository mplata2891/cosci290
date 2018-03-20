/*
  Mike Plata
  CoSci 290
  
  Lab 3
  1. 
  
  2. Use a random number generator
  
  3. use at least one compound/complex conditional with a logical
    operator, e.g. randomNum <= 80 && randomNum >= 70
    
*/
  
  
public class TestScenario{
  
  public static void main(String[] args){
  
  int minimum = 1;
  int maximum = 100;
  int randomNum = minimum + (int)(Math.random() * maximum);
  
  if(randomNum >= 90){
  System.out.println("You find something in the darkness. . . you've found a MASTER KEY!"
                     + " Lucky You.");
  }
  else if(randomNum <= 80 && randomNum >= 70){
    System.out.println("Oh, interesting. . . you've found a FLASHLIGHT!"
                      + " No more fumbling in the dark for you.");
  }
  else{
  System.out.println("What's that in the corner? Look closely. . . ."
                    + " ABSOLUTELY NOTHING! HAHAHAHAHAHAH!");
  }
  
  }
}