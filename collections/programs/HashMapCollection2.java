package collections.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection2 
{
	public static void main(String[] args)
	{
		HashMap<Integer, Person> hashMap=new HashMap<Integer,Person>();
		Person p1=new Person(101, "kumar",32000);
		Person p2=new Person(102, "Jai",23000);
		Person p3=new Person(103,"Mahesh",30000);
		hashMap.put(p1.getId(),p1);
		hashMap.put(p2.getId(),p2);
		hashMap.put(p3.getId(),p3);
		for(Map.Entry<Integer, Person> data:hashMap.entrySet())
		{
			if(data.getValue().getSal()>25000)
			{
			System.out.println(data);
			}
		}
	}
}
class Person
{
	private int id;
	private String name;
	private int sal;
	public Person(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal=sal;
	}
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
	public String toString()
	{
		return this.id+" "+this.name;
	}
	
}