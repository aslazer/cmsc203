import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String[] args) {
		//TASK #2 Create a Scanner object here 
		Scanner input = new Scanner(System.in);
		
		//identifier declarations
		final int NUMBER = 2; // number of scores
		double score1 = 100; // first test score
		double score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the users temperature
		double temperature;
		
		//Task #2 prompt user to input score1
		System.out.print("Enter score 1: ");
		
		//Task #2 read score1 
		score1 = input.nextDouble();
		
		//Task #2 prompt user to input score2
		System.out.print("Enter score 2: ");
		
		//Task #2 read score2 
		score2 = input.nextDouble();
		
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		fToC = (BOILING_IN_F - 32) * 5/9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		//Task #2 prompt user to input another temperature
		System.out.print("Enter another temperature in Farenheit: ");
		
		//Task #2 read the users temperature in Fahrenheit
		temperature = input.nextDouble();
		
		//Task #2 convert the users temperature to Celsius
		temperature = (temperature - 32) * 5/9;
		
		//Task #2 print the users temperature in Celsius
		System.out.println("Temperature in Celsius: " + temperature);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}