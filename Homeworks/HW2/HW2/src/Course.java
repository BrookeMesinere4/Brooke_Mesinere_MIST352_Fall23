
public class Course {

	private String courseCode;
	private String courseTitle;
	private String instructorName;
	private int maximumCapacity;
	private int currentEnrollment;
	
	public Course(String courseCode, String courseTitle, String instructorName)
	{
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.instructorName = instructorName;
		maximumCapacity = 0;
		currentEnrollment = 0;
	}
	
	public void setcourseCode (String courCode)
	{
		courseCode = courCode;
	}
	
	public void setcourseTitle (String courTitle)
	{
		courseTitle = courTitle;
	}
	
	public void setInstructorName (String insName)
	{
		instructorName = insName;
	}
	
	public void setMaximumCapacity (int maxCapacity)
	{
		maximumCapacity = maxCapacity;
	}
	
	public void setcurrentEnrollment (int currEnrollment)
	{
		currentEnrollment = currEnrollment;
	}
	
	public String getCourseCode()
	{
		return courseCode;
	}
	
	public String getcourseTitle()
	{
		return courseTitle;
	}
	
	public String getinstructorName()
	{
		return instructorName;
	}
	
	public int getmaximumCapacity()
	{
		return maximumCapacity;
	}
	
	public int getcurrentEnrollment()
	{
		return currentEnrollment;
	}
	
	public Course() {
		this.maximumCapacity = 30;
		this.currentEnrollment = 29;
	}
	
	public String enrollStudent()
	{
		if (currentEnrollment < maximumCapacity) {
			currentEnrollment++;
			return "successful";
		} else {
			return "not successful";
		}
	}
}

