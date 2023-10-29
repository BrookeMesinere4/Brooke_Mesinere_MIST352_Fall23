
public class Students {
	
	private String Name;
	private int ID;
	private String Major;
	private String DOB;
	private int Hours;

	public void setName (String theName)
	{
			Name = theName; 
	}
	public void setID (int theID)
	{
			ID = theID; 
	}     
	public void setMajor (String theMajor)
	{
			Major = theMajor;
	}
	public void setHours (int theHours)
	{
			if (action.equals("add")) {
				this.Hours += hours;
			} else if (action.equals("subtract")) {
				this.Hours -= hours;
			} else {
				return;
			}
	}
	public String getName()
	{
		return Name;
	}
	public int getID()
	{
		return ID;
	}
	public String getMajor()
	{
		return Major;
	}
	public String getDOB()
	{
		return DOB;
	}
	public int getHours()
	{
		return Hours;
	}
	
}
