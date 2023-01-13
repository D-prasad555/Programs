package studentdetails.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		List<Student> studentData=new ArrayList<>();
			
		studentData.add(new Student("sai",70, 80, 75));
		studentData.add(new Student("kumar",80, 78, 92));
		studentData.add(new Student("raj",82, 72, 86));
		
		//Method 1
		int totalMarksInSubA=0;
		int totalMarksInSubB=0;
		int totalMarksInSubC=0;
		for(Student marks:studentData)
		{
			int totalMarks=0;
			totalMarks=marks.getSubA()+marks.getSubB()+marks.getSubC();
			totalMarksInSubA=totalMarksInSubA+marks.getSubA();
			totalMarksInSubB=totalMarksInSubB+marks.getSubB();
			totalMarksInSubC=totalMarksInSubC+marks.getSubC();
			System.out.println(marks.getName()+" Marks details ");
			System.out.println("Total Marks "+totalMarks+" Marks average "+totalMarks/3);
		}
		System.out.println("Total marks scored by students in subA = "+totalMarksInSubA+ " Average = "+totalMarksInSubA/3);
		System.out.println("Total marks scored by students in subB = "+totalMarksInSubB+ " Average = "+totalMarksInSubB/3);
		System.out.println("Total marks scored by students in subC = "+totalMarksInSubC+ " Average = "+totalMarksInSubC/3);
	}
	
}
