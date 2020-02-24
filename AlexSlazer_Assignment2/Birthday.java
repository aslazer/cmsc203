/**
 * This program lets the user enter a toy order and computes the total cost of the order
 * Programmer: Alex Slazer
 */
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Birthday {
	
	public static void main(String[] args) {
		
		/** Declaring String variables to store option, name of child, toy choice, and whether or not the user wants a balloon/card */
		String option, name, toyChoice;
		
		/** Declaring integer variables to store the age of child and the order number */
		int age, orderNumber;
		
		/** Declaring double variable to store the cost of the order */
		double costOrder = 0;
		
		/** Declaring boolean variable to store whether or not the loop(s) should run again */
		boolean runAgain = false;
		
		/** Displaying welcome message */
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company \nto choose gifts for young children \n");
		
		/** Creating Toy object */
		Toy toy = new Toy();
		
		do {
			
			do {
				
				/** Setting the name of the child */
				name = JOptionPane.showInputDialog("Enter the name of the child"); 
				
				/** Setting the age of the child */
				age = Integer.parseInt(JOptionPane.showInputDialog("How old is the child?"));
				toy.setAge(age);
				
				/** Getting the toy choice from user */
				toyChoice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
				
				/** Verifying that the toy choice is valid */
				while(!toyChoice.equalsIgnoreCase("plushie") && !toyChoice.equalsIgnoreCase("blocks") && !toyChoice.equalsIgnoreCase("book")) {
					
					JOptionPane.showMessageDialog(null, "Invalid choice \nPlease choose again");
					toyChoice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
				}
					
				/** Setting the toy choice */
				toy.setToy(toyChoice);
				
				/** Verifying that toy choice is age-appropriate for the child */
				if(toy.ageOK() == false) {
					
					option = JOptionPane.showInputDialog("Toy is not age-appropriate " +"\n" +"Do you want to buy a different toy? Yes or No");
					
					while(!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
						
						JOptionPane.showMessageDialog(null, "Invalid choice \nPlease choose again");
						option = JOptionPane.showInputDialog("Toy is not age-appropriate " +"\n" +"Do you want to buy a different toy? Yes or No");
					}
					if(option.equalsIgnoreCase("yes")) {
						
						runAgain = true;
					}
					else {
						
						runAgain = false;
					}
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Good Choice!");
					runAgain = false;
				}
				
				/** Setting the cost of the toy */
				toy.setCost(toyChoice);
			
			}while(runAgain == true);
			
			/** Determining if the user wants a card with the toy and adding the cost to the gift/order */
			option = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
			
			/** Verifying that card choice is valid */
			while(!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
				
				JOptionPane.showMessageDialog(null, "Invalid choice \nPlease choose again");
				option = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
			}
			
			toy.addCard(option);
			
			/** Determining if the user wants a balloon with the toy and adding the cost to the gift/order */
			option = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
			
			/** Verifying that balloon choice is valid */
			while(!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
				
				JOptionPane.showMessageDialog(null, "Invalid choice \nPlease choose again");
				option = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
				
			}
			toy.addBalloon(option);
			
			/** Displaying the total cost of the gift */
			JOptionPane.showMessageDialog(null, "The gift for " + name + toy.toString());
			
			/** Asking the user if they want to add another toy */
			option = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
			
			while(!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
				
				JOptionPane.showMessageDialog(null, "Invalid choice \nPlease choose again");
				option = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
			}
			if(option.equalsIgnoreCase("yes")) {
				
				runAgain = true;
			}
			else {
				
				runAgain = false;
			}
			
			/** Running total of the order cost */
			costOrder += toy.getCost();
		}while(runAgain == true);
		
		/** Generating order number */
		orderNumber = (int)(Math.random()*100000);
		
		/** Displaying the order information to user */
		JOptionPane.showMessageDialog(null, "Order number is " + orderNumber + "\nProgrammer: Alex Slazer");
		
		/** Formatting the cost of the order */
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		/** Displaying the order information to console */
		System.out.println("The gift for " + name + toy.toString());
		System.out.println("\nThe total cost of your order is $" + dollar.format(costOrder));
		System.out.println("\nOrder number is " + orderNumber);
		System.out.println("\nProgrammer: Alex Slazer");
	}
}
