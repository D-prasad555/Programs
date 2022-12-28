package collections.programs;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection 
{
	public static void main(String[] args) {
		TreeMap<Integer, Emp> map=new TreeMap<>();
		Emp emp1=new Emp(101, "kumar", 20000);
		Emp emp2=new Emp(102, "ram", 22000);
		Emp emp3=new Emp(103, "hari", 25000);
		map.put(1, emp1);
		map.put(3, emp3);
		map.put(2, emp2);
		
		for(Map.Entry<Integer, Emp> data:map.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue().geteId()+" "+data.getValue().geteName()+" "+data.getValue().getSal());
		}
	}
}
class Emp
{
	private int eId;
	private String eName;
	private int sal;
	public Emp(int eId, String eName, int sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.sal = sal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
