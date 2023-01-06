package optionalclass.programs;

public class OptionalClass2 
{
	public static void main(String[] args) 
	{
		
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("sai");
		emp.setSal(20000);
		//emp.setDept("Mech");
		if(emp.getDept()!=null)
	    {
		String dept=emp.getDept().toLowerCase();
		}
		
		emp.print();
	}
}
class Employee
{
	private int id;
	private String name;
	private int sal;
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print()
	{
		System.out.println(id+" "+name+" "+sal+" "+dept);
	}
}