/*
 * WindChill Project : Displays the temperature adjusted for wind chill.
 * Alex Slazer
 * 1/29/2020
 */
import java.util.Scanner;

public class WindChillCalculator {
	
	public static void main (String[] args) {
		
		//Displaying header.
		System.out.println("Wind Chill Calculator");
		System.out.println();
		
		//Creating Scanner object to read user input from keyboard.
		Scanner input = new Scanner(System.in);
		
		//Creating constants of type double to be used in formula. 
		final double A = 35.74;
		final double B = 0.6215;
		final double C = 35.75;
		final double D = 0.4275;
		
		//Declaring variable of type double to store the temperature from user. 
		double temperature;
		
		//Getting the temperature from the user.
		System.out.print("Please enter the temperature in Farenheit (must be >= -45 and <= 40): ");
		temperature = input.nextDouble();
		
		//Checking if the temperature is within the range.
		if(temperature < -45 || temperature > 40) {
			//Displaying error message.
			System.out.println("Error, temperature is out of bounds.");
		}
		else {
			//Declaring variable of type double to store the wind speed from user. 
			double windSpeed;
			
			//Getting the wind speed from the user.
			System.out.print("Please enter the wind speed (must be >= 5 and <= 60): ");
			windSpeed = input.nextDouble();
			input.close();
			
			//Verifying if the wind speed is within range.
			if(windSpeed < 5 || windSpeed > 60) {
				//Displaying error message.
				System.out.println("Error, wind speed is out of bounds.");
			}
			else {
				//Calculating the adjusted temperature.
				double windChill = A + (B*temperature) - (C*(Math.pow(windSpeed, 0.16))) + (D*temperature*(Math.pow(windSpeed, 0.16)));
				
				//Displaying the adjusted temperature. 
				System.out.println("\n" +"Wind chill temperature: " +windChill +" degrees Fahrenheit.");
				
				//Displaying programmer name. 
				System.out.println("\n" +"Programmer: Alex Slazer");
			}
		}
		//Displaying programmer name. 
		System.out.println("\n" +"Programmer: Alex Slazer");
	}
}
