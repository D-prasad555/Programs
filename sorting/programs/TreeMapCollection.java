package sorting.programs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection
{
	public static void main(String[] args)
	{
		
		TreeMap<Integer, StudentList> treeMap=new TreeMap<Integer, StudentList>();
		
		StudentList s1=new StudentList(12, "sai", 23);
		StudentList s2=new StudentList(5, "jai", 24);
		StudentList s3=new StudentList(21, "ram", 22);
		StudentList s4=new StudentList(2, "mahesh", 25);
		treeMap.put(111,s1);
		treeMap.put(102,s2);
		treeMap.put(109,s3);
		treeMap.put(420,s4);
	
		for(Map.Entry<Integer, StudentList> data:treeMap.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue().getId()+" "+data.getValue().getName());
		}
	}
	
	
}


