import java.util.Random;

public class Runner 
{
	static String[] firstName = {"Dustin", "Daniel", "Eliott", "Karen", "Lisa", "Jennie", "Emilio", "Emily", "Edward", "Joan"};
	static String[] familyName = {"Sun", "Li", "Kim", "John", "Lin", "Lee", "Smith", "Anderson", "Hamilton"};
	static String[] gender = {"Male", "Female"};
	static double[] GPA = {100.3, 99.5, 98.52, 97.4, 101.2, 96.78, 99.99, 95.12};
	static int[] OSIS = {290805000, 209800000, 207849456, 219608234, 204576890};
	static String[] email = {"dli0793@bths.edu", "dsun9872@bths.edu", "klin8234@bths.edu"};
	static String[] gradeLevel = {"9", "10", "11", "12"};
	
	public static void main(String[] args)
	{
		Person teacher = new Teacher("Daniel", "Li", "dli0793@bths.edu", "Male", "Math", "Mr.");
		Person[] students;
		students = new Person[30];
		for (int i=0;i<students.length;i++)
		{
			students[i] = randomStudent();
		}
		Classroom classroom = new Classroom(students, teacher);
		
		System.out.println(classroom.toString() + "\nClass Average: " + classroom.classAverage(students));
	}

	public static Person randomStudent()
	{
		Random r = new Random();
		String firstNames = firstName[r.nextInt(firstName.length)];
		String familyNames = familyName[r.nextInt(familyName.length)];
		String genders = gender[r.nextInt(gender.length)];
		String emails = email[r.nextInt(email.length)];
		String gradelevel = gradeLevel[r.nextInt(gradeLevel.length)];
		int osis = OSIS[r.nextInt(OSIS.length)];
		double gpa = GPA[r.nextInt(GPA.length)];
		Person student = new Student(firstNames, familyNames, emails, genders, gpa, osis, gradelevel);
		return student;
	}
	
	
}
