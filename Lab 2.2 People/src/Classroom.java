import java.util.Arrays;

public class Classroom 
{
	Person[] students;
	Person teacher;
	
	public Classroom(Person[] students, Person teacher) 
	{
		super();
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject()
	{
		return Teacher.getSubject();
	}
	
	public double classAverage(Person[] students)
	{
		double averageSum = 0;
		
		for(int i = 0;i<students.length;i++)
		{
			averageSum += Student.getGPA();
		}
		
		return averageSum/students.length;
	}

	public String toString() {
		return "Classroom [students=" + Arrays.toString(students) + ", teacher=" + teacher + ", getSubject()="
				+ getSubject() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
