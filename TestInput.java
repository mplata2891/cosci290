/*
  Mike Plata
  CoSci 290
  
  Testing datatupes and input from the user
  */
import java.util.Scanner; //is a Java object that allows you to take input
public class TestInput{

  //main method - starting point of the application
  public static void main(String[] args){
    //datatype variableName = expression
    //1. Identifiers can only start with a letter, _, or $
    //2. Identifiers with multiple words are camelCased
    //e.g. - numOfStudents, name, interestRate
    
    //datatypes
    //int - integer - whole number => 3, 2147483647, 102, -11
    //double - decimal number => 3.33, 0.2m 0.33333, -33.33
    //char - single character inside single quotations => '3', '!', ' '
    //boolean - true or false => true, false
    
    //object /reference datatypes
    //String - characters surrounded with a double quotations => "sjdkfjsdfl", "cat", "3"
    /*There are other objects in Java that comes with Java and that are custom
      => Objects/class that comes with Java: Scanner, System, etc.Objects
      => Customer Classes: Zombie, SpaceInvader, Person, etc.Objects
      */
    
    final double PI_VALUE = 3.1415; //constants are all capital, multiple words separated by underscores
    String name = "Sina";
    name = "Cesar";
    int numberOfStudents = 29;
    double avgGpa = 3.78;
    boolean gameOver = false; //or true
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, give me your name: ");
    
    name = input.next(); //.next() is for String types
    
    System.out.println("Hi " + name);
    
    System.out.println("How old are you?");
    
    age = input.nextInt(); //.nextInt is for int types
    
    System.out.println("You are " + age + " years old!");
    
    /*
      Arithmetic Operators
      + addition
      - subtraction
      * multiplication
      / division
      % modulus, remainder - e.g. 10 %2 ==> 10 / 2 and then finding the remainder, which is 0
      = assignment operator, equals
      
      Programming Math operations follow the same order of operations as in Math
      Parentheses, Exponents, Multiplicaiton or Division, Addition or Subtraction
      from left to right
      
     */
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println("You are " + month + " months old OR " + days + " days old OR " 
                       + hours + " hours old!");
    
  }
}