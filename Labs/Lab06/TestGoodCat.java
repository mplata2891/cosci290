/*
  Mike Plata
  CoSci 290
  Lab 06 (Sub Class - GoodCat)

  lab 06 Description: Test your custom class developed in last week's lab.
                      Test this class in another class with main method. Name
                      this test class accordingly. For example, if your custom
                      class/object was Zombie, then call this class TestZombie.

                      Think of another class/object for your text adventure that
                      may require the use of inheritance. For example, your text
                      adventure could have different kinds of zombies. Think of
                      the Zombie class as a general Zombie class that maybe
                      ZombieCat might extend from. ZombieCat would be a subclass
                      to Zombie class and inherit all of its properties and
                      methods. Write a custom subclass that follows this concept.

                      Please also write a test class for this subclass.

Note: This lab was due Mar 6th, but due to all of the syntax errors that I've
      been struggling with on my custom classes, I was unable to complete. It's
      now Mar 26, and I thought I might try writing a simpler class that's also
      needed for our text adventure, in order to complete this lab.

      I hope due to these circumstances I can still get a good amount of the
      points offered for this lab. As long as it's executed correctly.
*/

//class to test Sub Class - GoodCat
public class TestGoodCat{

  //entry point of application
  public static void main(String[] args){

    //instantiate and declare a new object of type GoodCat
    GoodCat gCat01 = new GoodCat();

    //prints out the object by calling the toString method inside
    //a print method
    System.out.print(gCat01.toString());
  }
}
