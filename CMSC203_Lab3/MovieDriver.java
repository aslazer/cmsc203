import java.util.Scanner;

/**
 * This driver class gets information about a movie from the user and displays it on the console.
 * @author aslaze
 */
public class MovieDriver {

	public static void main(String[] args) {
		
		//Creating Scanner object
		Scanner scan = new Scanner(System.in);
		//Creating movie object
		Movie movie = new Movie();
		
		//Declaring three String variables to store movie title, rating, and run again.
		String movieTitle, rating, runAgain;
		
		//Declaring integer to store tickets sold
		int ticketsSold;
		
		do {
			//Getting the movie title from the user and setting it in movie object
			System.out.print("Enter movie title: ");
			movieTitle = scan.nextLine();
			movie.setTitle(movieTitle);
		
			//Getting the rating from the user and storing it in movie object
			System.out.print("Enter movie rating: ");
			rating = scan.nextLine();
			movie.setRating(rating);
		
			//Getting the tickets sold from the user and storing it in movie object
			System.out.print("Enter tickets sold: ");
			ticketsSold = scan.nextInt();
		
			//Printing out the information entered through the toString method
			System.out.println(movie.toString());
			
			//Asking user if they want to enter another movie
			System.out.print("Would you like to enter another movie? Enter y/n: ");
			runAgain = scan.next();
		}while(runAgain.equals("y"));
	}

}
