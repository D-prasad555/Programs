package collections.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeUsingSetterGetter 
{
	public static void main(String[] args)
	{
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
			
		emp1.setempId(101);
		emp2.setempId(102);
		emp3.setempId(103);
		
		emp1.setempName("Raj");
		emp2.setempName("Ram");
		emp3.setempName("Jai");
		
		emp1.setsalary(12000);
		emp2.setsalary(15000);
		emp3.setsalary(14000);
		
		List<Employee> e=new ArrayList<Employee>();
		e.add(emp1);
		e.add(emp2);
		e.add(emp3);
		
	/*  ListIterator<Employee> li=e.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}*/
	
	/*When we try to print object(e object) it implicitly call toString method if we not override toString method it prints 
	 * class name@address it is default implementation of toString method. In this program toString method is overridden 
	 for(Employee data:e)  
	    {                                               
			System.out.println(data);  
		}*/
		
	    for(Employee data:e)   //When we try to print object it will 
		{
			System.out.println(data.display());  
		}
	
			
	}
}
class Employee
{
	int empId;
	String empName;
	int salary;
	
	public void setempId(int empId)
	{
		this.empId=empId;
	}
	public int getempId()
	{
		return empId;
	}
	public void setempName(String empName)
	{
		this.empName=empName;
	}
	public String getempName()
	{
		return empName;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getsalary()
	{
		return salary;
	}
	public String toString() //toString method is overridden.
	{
		return empId+" "+empName+" "+" "+salary;
	}
	public String display() //toString method is overridden.
	{
		return empId+" "+empName+" "+" "+salary;
	}
	
}