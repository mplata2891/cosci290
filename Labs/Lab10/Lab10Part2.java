/*
	Mike Plata
	Lab10-Part2

	2. Also, do problem in the book to review programming concepts:
		7.8 (Average an array) Write two overloaded methods that return the average
		of an array with the following headers:

		public static int average(int[] array)

		public static double average(double[] array)

		Write a test program that prompts the user to enter ten double values,
		invokes this method, and displays the average value.
*/

import java.util.Scanner;
public class Lab10Part2{

	//entry point of application
	public static void main(String[] args){

		//declare and instantiate an object of type array
		double arrayOfDoubles[] = new double[10];

		//declare and initialize variables needed
		double average = 0;

		//call displayDescription method
		displayDescription();

		//call takeValues method
		takeValues(arrayOfDoubles);

		//call average method
		average = average(arrayOfDoubles);

		//display average value to user
		System.out.println("The average value of the numbers is: " + average + ".\n");
	}

/*
	method to display a brief description of what the
	program does, to the user
*/
public static void displayDescription(){

	//prints description to the user
	System.out.println("Hello user! This program allows you to enter ten\n"
						+ "real numbers. The program will then display the\n"
						+ "average value of all the numbers entered\n");
}

/*
	method for prompting the user to enter ten integer
	values. the ten values will be stored in an array.
*/
public static void takeValues(int[] array){

	//instantiates object of type Scanner to
	//extract input from user
	Scanner input = new Scanner(System.in);

	//initiates for loop to prompt user for
	//input and store input in array
	for(int i = 0; i < array.length; i++){

		//prompts user for input
		System.out.print("Please enter a whole number: ");

		//takes input from user and saves into array
		array[i] = input.nextInt();

		//starts new line
		System.out.print("\n");

	}
}

/*
	method for prompting the user to enter ten double
	values. the ten values will be stored in an array.
*/
public static void takeValues(double[] array){

	//instantiates object of type Scanner to
	//extract input from user
	Scanner input = new Scanner(System.in);

	//initiates for loop to prompt user for
	//input and store input in array
	for(int i = 0; i < array.length; i++){

		//prompts user for input
		System.out.print("Please enter a whole number: ");

		//takes input from user and saves into array
		array[i] = input.nextDouble();

		//starts new line
		System.out.print("\n");

	}
}

/*
	method for taking the ten values of type integer
	in an array and returning the average of those
	values
*/
public static int average(int[] array){

	//declare and initialize needed variables
	int total = 0;

	//initiates for loop to prompt user for
	//input and store input in array
	for(int i = 0; i < array.length; i++){

		//sums all values in array and saves total
		total += array[i];

	}

	return total / 10; //returns calculated value
}

/*
	method for taking the ten values of type double
	in an array and returning the average of those
	values
*/
public static double average(double[] array){

	//declare and initialize needed variables
	double total = 0;

	//initiates for loop to prompt user for
	//input and store input in array
	for(int i = 0; i < array.length; i++){

		//sums all values in array and saves total
		total += array[i];

	}

	return total / 10; //returns calculated value
}
}
