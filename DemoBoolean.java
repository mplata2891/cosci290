/*
  Mike Plata
  CoSci 290
  
  Demo topics on:
    - increment/decrement operators
    - augmented assignment
    - casting with ints doubles and chars
    - control structures
*/

public class DemoBoolean{

  //start of application
  public static void main(String[] args){
    
    //line 17 and 18 are equivalent
    int num = 1; 
    num = num + 1; //increment num by 1
    num++;
    ++num;
    
    num = 1;
    int count = ++num;//pre-increment, count 2, num 2
    System.out.println("count " + count + " num " + num);
    num = 1;
    count = num++; //post-increment, count 1, num 2
    System.out.println("count " + count + " num" + num);
    
    count = num--; //post-decrement
    count = --num; //pre-decrement
    
    //examples of augmented assignment operators
    num += 2; //equivalent to => num = num + 2;
    num *= 2; //equivalent to => num = num * 2;
    num /= 2; //num = num / 2;
    num -= 2; //num = num - 2;
    
    num = 2;
    double num2 = 3.0;
    System.out.println("Double wins: " + (num * num2));
    System.out.println("Casting a double to an int: " + (int)num2);
    System.out.println("Casting an int to a double: " + (double)num);
    System.out.println("casting a char to an int " + (int)'c');
    
    int numberOfZombies = 3;
    int actualNumberOfZombies = 100;
    
    if(numberOfZombies == acctualNumberOfZombies){
      System.out.println("You might survive this apocalypse.");
    }
      else{
        System.out.println("You might NOT survive this apocalypse.");
      }
    }
  
  //Generating a random number 
  //Math.pow(3, 2); 3^2
  System.out.println(Math.random()); //gives a random number between zero and one
  
  //min + (Math.random() * (max - min))
  System.out.println(5 + (int)(Math.random() * (10 - 5)));
      
  }
}