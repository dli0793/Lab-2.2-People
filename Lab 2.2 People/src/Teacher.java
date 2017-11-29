
public class Teacher extends Person
{
	private static String Subject;
	private String Title;
	
	public Teacher(String firstName, String familyName, String email, String gender, String subject, String title) 
	{
		super(firstName, familyName, email, gender);
		this.Subject = subject;
		this.Title = title;
	}

	public static String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	
	public String toString()
	{
		return Title + "." + getFamilyName();
	}
	
}
