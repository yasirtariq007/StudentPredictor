
public class POLS1101 extends Course {

	public double StandardizedExam;
	
	public POLS1101 ()
	{
		super();
		StandardizedExam = 0.0;
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
	
	public double StandardizedExam(double s)
	{
		StandardizedExam = s;
	   	return StandardizedExam;
	}
	
	public double CourseAverage()
	{
		return ((StandardizedExam * .05) + (tests * .75) + (quizzes * .20));
	}
}
