/*
	Mike Plata
	
	Lab10-Part2
*/

public class Lab10-Part2{
	
	public static void main(String[] args){
		
		
	}
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
	for(int i = 0; i < 10; i++){
		
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
	for(int i = 0; i < 10; i++){
		
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
	for(int i = 0; i < 10; i++){
		
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
	for(int i = 0; i < 10; i++){
		
		//sums all values in array and saves total
		total += array[i];

	}
	
	return total / 10; //returns calculated value
}