
public class HW2 {

	public static void main(String[] args) {
		
		// Create Courses and students
		Course mist352 = new Course();
		Course cs101 = new Course();
		Students ashley = new Students();
		Students ali = new Students();
		
		//Enrollment students in course
		System.out.println("Enrolling Ashley Jaber in MIST352 " + mist352.enrollStudent());
		System.out.println("Current enrollment" + mist352.getcurrentEnrollment());
		
		//make Course details
		mist352.setcourseCode("MIST352");
		mist352.setcourseCode("MIST352 Title");
		mist352.setInstructorName("MJ Ahmad");
		
		//set test scores
		TestScore mist352Grades = new TestScore(80, 75, 85);
		mist352Grades.setScore1(80);
		mist352Grades.setScore2(75);
		mist352Grades.setScore3(85);

		//print out gpa
		System.out.println("The current GPA is: " + mist352Grades.getAverageScore());
		
		//repeat course details scores and gpa for cs101
		System.out.println("Enrolling Ashley Jaber is CS101 " + cs101.enrollStudent());
		System.out.println("Current enrollment " + cs101.getcurrentEnrollment());
		
		//make Course details
		cs101.setcourseCode("CS101");
		cs101.setcourseTitle("CS101 Title");
		cs101.setInstructorName("Instructor Name");
		
		//set test scores 
		TestScore cs101Grades = new TestScore(80, 90, 75);
		cs101Grades.setScore1(80);
		cs101Grades.setScore2(90);
		cs101Grades.setScore3(75);
		
		System.out.println("The current GPA is: "  + cs101Grades.getAverageScore());
		
		//compare ashley's gpa
		double mist352GPA = mist352Grades.getAverageScore();
		double cs101GPA = cs101Grades.getAverageScore();
		
		if(mist352GPA > cs101GPA) {
			System.out.println("Ashley's GPA in MIST352 is greater than in CS101.");
		} 
		else if (cs101GPA > mist352GPA) {
			System.out.println("Ashley's GPA in CS101 is greater than in MIST352.");
		}
		else {
			System.out.println("Ashley's GPA is the same in both courses");
		}
		
		//Enroll Ali June in the same classes
		System.out.println("Enrolling Ali June in MIST352 " + mist352.enrollStudent());
		System.out.println("Enrolling Ali June in CS101 " + cs101.enrollStudent());
		
		
		

	}

}
