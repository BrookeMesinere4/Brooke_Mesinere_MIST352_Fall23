// i. Author: Brooke Mesinere
// ii. Class: MIST352-Fall23
// iii. HW #1
// iv. Numbers 1 and 2 are added by the user.
/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class HW1 {
//Name of class should reflect the class name 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hi");
// Added a semicolon

System.out.println("Enter value for num1");
Scanner keyboard = new Scanner (System.in);
int num1 = keyboard.nextInt();

System.out.println("Enter value for num2");
double num2 = keyboard.nextDouble();

double sum = num1 + num2;

System.out.println("Sum: " + sum);





	}

}