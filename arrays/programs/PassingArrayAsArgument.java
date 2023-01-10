package arrays.programs;

public class PassingArrayAsArgument 
{
	public static void main(String[] args)
	{
		Student stu[]=new Student[3];
		stu[0]=new Student(1, "jai", 23);
		stu[1]=new Student(2, "ram", 24);
		stu[2]=new Student(3, "raj", 25);
		details(stu);
	}
	public static void details(Student s[])
	{
		for(Student data:s)
		{
			System.out.println(data.stuId+" "+data.name+" "+data.age);
		}
	}
}
class Student
{
	int stuId;
	String name;
	int age;
	
	Student(int stuId,String name,int age)
	{
		this.stuId=stuId;
		this.name=name;
		this.age=age;
	}
}