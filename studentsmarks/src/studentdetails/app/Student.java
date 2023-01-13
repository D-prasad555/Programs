package studentdetails.app;

public class Student 
{
	private String name;
	private int subA;
	private int subB;
	private int subC;
	
	public Student(String name,int subA, int subB, int subC) {
		super();
		this.name=name;
		this.subA = subA;
		this.subB = subB;
		this.subC = subC;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getSubA() {
		return subA;
	}

	public void setSubA(int subA) {
		this.subA = subA;
	}

	public int getSubB() {
		return subB;
	}

	public void setSubB(int subB) {
		this.subB = subB;
	}

	public int getSubC() {
		return subC;
	}

	public void setSubC(int subC) {
		this.subC = subC;
	}

	@Override
	public String toString() {
		return "Student subA=" + subA + ", subB=" + subB + ", subC=" + subC ;
	}
	
	
}
