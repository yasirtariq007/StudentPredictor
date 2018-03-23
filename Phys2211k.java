
public class Phys2211k extends Course {
	 
	public double lab;
	
	public Phys2211k()
	{
		super();
		lab = 0.0;
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
	
	public double lab(int [] array)
	{
		{
			for (int i = 0; i < array.length; i++)
		   	{
		   		System.out.println("Enter lab grade " + (i+1));
		   		array[i] = scan.nextInt();
		   	}
		   	lab =  CourseModule.lowAverage(array);
		   	return lab;
		}
	}
	
	public double CourseAverage()
	{
		return ((homework * .25) + (tests * .20) + (quizzes * .10) + (lab * .15) + (Final * .30) );
	}
}
