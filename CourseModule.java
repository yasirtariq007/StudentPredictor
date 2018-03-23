import java.util.Arrays;

public class CourseModule {
	
	public static double Average(int [] grade)
	 {
	  int sum = 0;
	  for (int i = 0; i <grade.length; i++)
	  {
	   sum = sum + grade[i];
	  }
	  return ((sum) / (grade.length));
	 }
	
	public static double lowAverage(int [] grade)
	 {
	  int sum = 0;
	  Arrays.sort(grade);
	  int min = grade[0];
	  for (int i = 0; i <grade.length; i++)
	  {
	   sum = sum + grade[i];
	  }
	  return ((sum-min) / (grade.length-1));
	 }
	 
	
	

}

