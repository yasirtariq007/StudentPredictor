
public class ENG1101 extends Course{
	
	public double Essay;
	
	public ENG1101 ()
	{
		super ();
		Essay = 0;
	}
	
	public double Essay(int [] array)
	{
		for (int i = 0; i < array.length; i++)
	   	{
	   		System.out.println("Enter essay grade " + (i+1));
	   		array[i] = scan.nextInt();
	   	}
	   	Essay =  CourseModule.Average(array);
	   	return Essay;
	}
	
	public double CourseAverage()
	{
		return (Essay * 1.0);
	}

}
