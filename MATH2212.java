import java.util.*;

public class MATH2212 extends Course{
	
	public MATH2212 ()
	{
		super();
	}
	
	public double tests(int [] array)
	{
		for (int i = 0; i < array.length; i++)
	   	{
	   		System.out.println("Enter test grade " + (i+1));
	   		array[i] = scan.nextInt();
	   	}
	   	tests =  CourseModule.lowAverage(array);
	   	return tests;
	}
	
	public double quizzes(int [] array)
	{
		for (int i = 0; i < array.length; i++)
	   	{
	   		System.out.println("Enter quiz grade " + (i+1));
	   		array[i] = scan.nextInt();
	   	}
	   	quizzes =  CourseModule.lowAverage(array);
	   	return quizzes;
	}
	   	
	public double CourseAverage()
	{
		return ((homework * .15) + (tests * .40) + (quizzes * .15) + (attendanceGrade * .05) + (Final * .25) );
	}
}