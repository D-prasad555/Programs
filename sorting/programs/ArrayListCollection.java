package sorting.programs;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection 
{
	public static void main(String[] args)
	{
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(101, "sai", 27));
		s.add(new Student(103, "jai", 22));
		s.add(new Student(107, "ram", 23));
		s.add(new Student(102, "suresh", 22));
		s.add(new Student(110, "kumar", 29));
		
		Collections.sort(s,new AgeComparator());
		
		for(Student data:s)
		{
			System.out.println(data);
		}
		
		System.out.println("-------------");
		
		Collections.sort(s,new NameComparator());
		
		for(Student data:s)
		{
			System.out.println(data);
		}
	}
}
