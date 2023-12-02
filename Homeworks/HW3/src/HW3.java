/**
 * 
 */

/**
 * @author MJ
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class HW3 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
	//****** Keep as is *******************
		// The location of the employee text file 
		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation);
	//*************************************

		
		while(intChoice !=0)
		{
			switch(intChoice)
			{
			case 1:
				//shows all data
				myData.ViewEmployeeAndIDs();
				break;
			case 2:
				//looks for employees by their names
				String employeeName = JOptionPane.showInputDialog(null, "Enter employee Name");
				myData.SearchEmployee(employeeName);
				break;
			case 3:
				//shows the roles in the company
				myData.ViewRoles();
				break;
			case 4:
				//search the certain roles that people have
				String roleToView = JOption.showInputDialog(null, "Provide rolento view employees");
				myData.ViewEmployeeForRole(roleToView);
				break;
			case 5:
				//return the average salary of the whole company
				double averageSalary = myData.getAverage();
				JOptionPane.showMessageDialog(null, "The average is: " + averageSalary);
				break;
			case 6:
				//pulls employee from the employee class
				String line = JOptionPane.showInputDialog("Enter the data number");
				Employee employee = new Employee(line);
				employee.setAboveAvg(myData.getAverage());
				employee.SummerizeEmployee();
				break;
			}
			intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));	
		}


		writer.close();
		inputFile.close();	
		
	}
	/**	 
	 * Keep as is
	 * A method to display options
	 * @return : The options to display in the GUI
	 */
	
	public static String ViewOptions()
	{
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	} }
	
	
	
	



