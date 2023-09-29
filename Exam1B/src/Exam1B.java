//i.Brooke Mesinere
//ii.September 28
//iii.Exam 1 Part B 
//iv. This program runs the message Welcome to exam 1b and provides the length and output.

/* 
 *
 */

import java.util.Scanner;
/**
 * 
 */
public class Exam1B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display Welcome to Exam 1B message
		System.out.println("Welcome to Exam1B program");
		//Declare scanner
		Scanner keyboard = new Scanner (System.in);
		//Obtain user input
		System.out.println("Enter Text");
		String userInput = keyboard.next();
		//Declare length and provide input
		int length = userInput.length();
		System.out.println("The length of " + userInput + "is" + length + "letters long");
		
		System.out.println("Enter char to find");
		char userCharInput = keyboard.next().charAt(0);
		
		int index = userInput.indexOf(userCharInput);
		System.out.println("The first instance of " + userCharInput + "is at index" + index);
		
		keyboard.close();
		
		
		
		
		
		
		
		
		

	}

}
