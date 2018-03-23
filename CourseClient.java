import java.util.*;
public class CourseClient {
	public static void main(String [] args)
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("**********Welcome to Student Gradebook!**********");
	System.out.println();
	System.out.println("Here are the list of courses available to use: ");
	System.out.println("COURSE                    PROFESSOR ");
	System.out.println(">physics 2211k            Annika Akriisa");
	System.out.println(">chemistry 1211k          Jyotna Thota");
	System.out.println(">politics 1101            Anna Fleming");
	System.out.println(">english 1101             Daniel Holmes");
	System.out.println(">calculus 2212            Mohammed Jamaluddin");
	System.out.println(">statistics 2000                Staff");          
	System.out.println();
	
	System.out.println("Do you wish to see calculated course grade? ");
	String start = scan.nextLine();
	if (start.equals("yes"))
		{
		
		System.out.println("Enter class here ");
		String s = scan.nextLine();
		
		
		if (s.equals("politics 1101"))
		{
			POLS1101 gov = new POLS1101();
			
			System.out.println("Enter the amount of test grades ");
			int x = scan.nextInt();
			int [] govarray = new int[x];
			System.out.println("Here is your test average " + gov.tests(govarray));
			System.out.println("Your lowest test has been dropped " + govarray[0]);
			
			System.out.println("Enter the amount of quiz grades ");
			int y = scan.nextInt();
			int [] govarray1 = new int[y];
			System.out.println("Here is your quiz average " + gov.quizzes(govarray1));
			System.out.println("Your lowest test has been dropped " + govarray1[0]);
			
			System.out.println("Enter the standardized exam grade ");
			double stan = scan.nextDouble();
			
			System.out.println("Here is the score for your standardized exam " + gov.StandardizedExam(stan));
			System.out.println("Here is your class average for american government " + gov.CourseAverage());
			
		}
		else if(s.equals("english 1101"))
		{
			ENG1101 eng = new ENG1101();
			
			System.out.println("Enter the amount of essays ");
			int x = scan.nextInt();
			int [] engarr = new int[x];
			eng.Essay(engarr);
			System.out.println("Here is your class average for english " + eng.CourseAverage());
		}
		
		else if (s.equals("calculus 2212"))
		{
			MATH2212 math = new MATH2212();
			
			System.out.println("Enter the amount of homework grades ");
			int x = scan.nextInt();
			int [] matharray = new int[x];
			System.out.println("Here is your homework average " + math.homework(matharray));
			
			System.out.println("Enter the amount of test grades ");
			int x1 = scan.nextInt();
			int [] matharray1 = new int[x1]; 
			System.out.println("Here is your test average " + math.tests(matharray1));
			System.out.println("Your lowest test has been dropped " + matharray1[0]);
			
			System.out.println("Enter the amount of quiz grades ");
			int x2 = scan.nextInt();
			int [] matharray2 = new int[x2];
			System.out.println("Here is your quiz average " + math.quizzes(matharray2));
			System.out.println("Your lowest quiz has been dropped " + matharray2[0]);
			
			System.out.println("Here is your attendance grade " + math.attendanceGrade());
			
			System.out.println("Enter the final grade ");
			int f = scan.nextInt();
			
			System.out.println("Here is your final grade " + math.Final(f));
			
			System.out.println("Here is your class average for calculus " + math.CourseAverage());
		}
		
		else if (s.equals("statistics 2000"))
		{
			STAT2000 stat = new STAT2000();
			
			System.out.println("Enter the amount of homework grades ");
			int x = scan.nextInt();
			int [] statarray = new int[x];
			System.out.println("Here is your homework average " + stat.homework(statarray));
			
			System.out.println("Enter the amount of test grades ");
			int x1 = scan.nextInt();
			int [] statarray1 = new int[x1];
			System.out.println("Here is your test average " + stat.tests(statarray1));
			System.out.println("Your lowest test has been dropped " + statarray1[0]);
			
			System.out.println("Enter the amount of quiz grades ");
			int x2 = scan.nextInt();
			int [] statarray2 = new int[x2];
			System.out.println("Here is your quiz average " + stat.quizzes(statarray2));
			System.out.println("Your lowest quiz has been dropped " + statarray2[0]);
			
			System.out.println("Here is your attendance grade " + stat.attendanceGrade());
			
			System.out.println("Enter the final grade ");
			int f = scan.nextInt();
			
			System.out.println("Here is your final grade " + stat.Final(f));
			
			System.out.println("Here is your class average for statistics " + stat.CourseAverage());
		}
		
		else if (s.equals("physics 2211k"))
		{
			Phys2211k phys = new Phys2211k();
			
			System.out.println("Enter the amount of Homework grades ");
			int x = scan.nextInt();
			int [] physarray = new int[x];
			System.out.println("Here is your homework average: " + phys.homework(physarray));
			
			
			System.out.println("Enter the amount of test grades: " );
			int x1 = scan.nextInt();
			int [] physarray1 = new int[x1];
			System.out.println("Here is your test average: " + phys.tests(physarray1));
			System.out.println("Your lowest test has been dropped " + physarray1[0]);
			
			System.out.println("Enter the amount of quiz grades: ");
			int x2 = scan.nextInt();
			int [] physarray2 = new int[x2];
			System.out.println("Here is your quiz average: " +phys.quizzes(physarray2));
			System.out.println("Your lowest quiz has been dropped " + physarray2[0]);
			
			System.out.println("Enter the amount of lab grades: ");
			int x3 = scan.nextInt();
			int [] physarray3 = new int[x3];
			System.out.println("Here is your lab average: " + phys.lab(physarray3));
			System.out.println("Your lowest lab has been dropped " + physarray3[0]);
			
			System.out.println("Enter your final exam grade: ");
			int x4 = scan.nextInt();
			System.out.println("Here is your final exam grade: " + phys.Final(x4));
			
			System.out.println("Here is your course average: " + phys.CourseAverage());
		
			
			
		}
		else if(s.equals("chemistry 1211k"))
		{
			Chem1211k c = new Chem1211k();
			
			System.out.println("Enter the amount of homework grades: ");
			int y = scan.nextInt();
			int [] carray = new int[y];
			System.out.println("Here is your homework average: " + c.homework(carray));
			
			System.out.println("Enter the amount of lab grades: " );
			int y1 = scan.nextInt();
			int [] carray1 = new int[y1];
			System.out.println("Here is your lab average: " + c.lab(carray1));
			System.out.println("Your lowest lab has been dropped " + carray1[0]);
			
			System.out.println("Enter the amount of test grades: ");
			int y2 = scan.nextInt();
			int [] carray2 = new int[y2];
			System.out.println("Here is your test average: " + c.tests(carray2));
			System.out.println("Your lowest test has been dropped " + carray2[0]);
			
			System.out.println("Enter the amount of quiz grades: ");
			int y3 = scan.nextInt();
			int [] carray3 = new int[y3];
			System.out.println("Here is your quiz average: " + c.quizzes(carray3));
			System.out.println("Your lowest quiz has been dropped " + carray3[0]);
			
			System.out.println("Enter your final exam grade: ");
			int y4 = scan.nextInt();
			System.out.println("Here is your final exam grade: " + c.Final(y4));
			
			System.out.println("Here is your course average: " + c.CourseAverage());
		}
		
		else
		{
			System.out.println("You didn't select proper class! ");
		}
	}
	
	else
	{
		System.out.println("Check your class average when you have time.");
	}

	}
}

