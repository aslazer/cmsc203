import java.util.Scanner;

/**
 * This program calculates the volume of a sphere.
 */
public class SphereVolume {

	public static void main(String[] args) {
		
		//Creating Scanner object to read user input
		Scanner input = new Scanner(System.in);
		
		//Displaying header
		System.out.println("Volume of Sphere \n");
		
		//Declaring double variables to hold the diameter, radius, and volume
		double diam, radius, volume;
		
		//Getting the diameter from user
		System.out.print("Enter the diameter of the sphere: ");
		diam = input.nextDouble();
		input.close();
		
		//Calculating radius
		radius = diam/2;
		
		//Calculating volume
		volume = (Math.PI) * Math.pow(radius, 3) * 4/3;
		
		//Displaying volume to user
		System.out.println("The volume of sphere with diameter " + diam + " is " + volume + ".");
	}
}
