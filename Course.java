import java.util.*;

public class Course {
	
	public double homework;
	public double tests;
	public double quizzes;
	public double attendanceGrade;
	public double Final;
	public Scanner scan = new Scanner(System.in);
	
	public Course()
	{
		homework = 0.0;;
		tests = 0.0;
		quizzes = 0.0;
		attendanceGrade = 0.0;
		Final = 0.0;
	}
	
	public double homework(int [] array)// before make array and ask user to enter size of the array
	{
	   	for (int i = 0; i < array.length; i++)
	   	{
	   		System.out.println("Enter homework grade " + (i+1));
	   		array[i] = scan.nextInt();
	   	}
	   	homework = CourseModule.Average(array);
	   	return homework;
	}
	
	public double tests(int [] array)
	{
		for (int i = 0; i < array.length; i++)
	   	{
	   		System.out.println("Enter test grade " + (i+1));
	   		array[i] = scan.nextInt();
	   	}
	   	tests =  CourseModule.Average(array);
	   	return tests;
	}
	
	public double quizzes(int [] array)
	{
		for (int i = 0; i < array.length; i++)
	   	{
	   		System.out.println("Enter quiz grade " + (i+1));
	   		array[i] = scan.nextInt();
	   	}
	   	quizzes =  CourseModule.Average(array);
	   	return quizzes;
	}
	
	public double attendanceGrade()
	{
		System.out.println("Enter the number of days you attended class: " );
		int attended = scan.nextInt();
		System.out.println("Enter the total number of classes for the semester: ");
		int total = scan.nextInt();
		
		attendanceGrade = (((attended) * 100) / total);
		
	   	return attendanceGrade;
	}
	
	public double Final(int f)
	{
		Final = f;
	   	return Final;
	}
	
	public double CourseAverage()
	{
		return ((homework * .20) + (tests * .20) + (quizzes * .20) + (attendanceGrade * .20) + (Final * .20) );
	}

	
}
