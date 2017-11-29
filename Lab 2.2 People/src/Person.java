
public abstract class Person 
{
	private String firstName;
	private String familyName;
	private String email;
	private String gender;
	
	public Person(String firstName, String familyName, String email, String gender)
	{
		firstName=this.firstName;
		familyName=this.familyName;
		email=this.email;
		gender=this.gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString()
	{
		return "First Name: " + firstName + " Last Name: " + familyName + " Email: " + email + 
				" Gender: " + gender;
	}
	
}
