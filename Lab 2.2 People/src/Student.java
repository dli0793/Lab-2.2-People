
public class Student extends Person
{
	private static double GPA;
	private int OSIS;
	private String gradeLevel;
	
	public Student(String firstName, String familyName, String email, String gender, double gPA, int oSIS,
		   String gradeLevel) 
	{
		super(firstName, familyName, email, gender);
		Student.GPA = gPA;
		this.OSIS = oSIS;
		this.gradeLevel = gradeLevel;
	}

	public static double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public int getOSIS() {
		return OSIS;
	}

	public void setOSIS(int oSIS) {
		OSIS = oSIS;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public String toString() {
		return "Student [GPA=" + GPA + ", OSIS=" + OSIS + ", gradeLevel=" + gradeLevel + ", getGPA()=" + getGPA()
				+ ", getOSIS()=" + getOSIS() + ", getGradeLevel()=" + getGradeLevel() + ", getFirstName()="
				+ getFirstName() + ", getFamilyName()=" + getFamilyName() + ", getEmail()=" + getEmail()
				+ ", getGender()=" + getGender() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}	
}
