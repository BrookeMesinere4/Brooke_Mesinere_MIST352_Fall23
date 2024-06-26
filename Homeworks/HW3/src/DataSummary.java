import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Brooke Mesinere
 * @course MIST 352
 * @HW 3
 * @UsedChatGPT Yes
 *
 */
public class DataSummary {
	private String fileLocation;
	private double averageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return dblSum: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	public double getAverage() throws FileNotFoundException
	{ 
		File myFile = new File(fileLocation);
		
		Scanner inputFile = new Scanner(myFile);
		
		double totalSalary = 0;
		int numberOfEmployees = 0;
		
		while (inputFile.hasNextLine())
		{
			String strData2Show = inputFile.nextLine();
			String[] dataParts = strData2Show.split(",");
			totalSalary += Double.parseDouble(dataParts[6]);
			numberOfEmployees++;
		}
		
		inputFile.close();
		
		if (numberOfEmployees != 0)
		{
			return totalSalary / numberOfEmployees;
		} else {
			return 0.0;
		}
	}
	

	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeAndIDs() throws FileNotFoundException
	{ 
		File myFile = new File(fileLocation);
		Scanner inputFile = Scanner(myFile);
		
		while (inputFile.hasNextLine())
		{
			String strData2Show = inputFile.nextLine();
			System.out.println(strData2Show);
		}
		
		inputFile.close();
		
	}
	
	
	private Scanner Scanner(File myFile) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void SearchEmployee(String strEmployee) throws FileNotFoundException
	{
		String fileLocatioin = null;
		File myFile = new File(fileLocatioin);
		Scanner inputFile = new Scanner(myFile);
		
		boolean found = false;
		
		while (inputFile.hasNextLine())
		{
			String strData2Show = inputFile.nextLine();
			if (strData2Show.contains(strEmployee))
			{
				found = true;
				JOptionPane.showMessageDialog(null,strData2Show);
			}
		}
		
		inputFile.close();
		
		if(!found)
		{
			JOptionPane.showMessageDialog(null, "Employee not found");
		}
		 
	}
	
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException
	{
		File myFile = new File(fileLocation);
		Scanner inputFile = new Scanner(myFile);
		
		boolean found = false;
		
		while (inputFile.hasNextLine())
		{
			String strData2Show = inputFile.nextLine();
			String[] dataParts = strData2Show.split(",");
			if (dataParts[2].equalsIgnoreCase(strRole))
			{
				found = true;
				JOptionPane.showMessageDialog(null, strData2Show);
			}
		}
		
		inputFile.close();
		
	}
	

	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	
}
