package sorting.programs;

import java.util.Collections;
import java.util.LinkedList;

public class ComparableSorting 
{
	public static void main(String[] args) 
	{
		LinkedList<Product> p=new LinkedList<>();
		p.add(new Product(101, "Dell",33000 ));
		p.add(new Product(109, "Hp",39000 ));
		p.add(new Product(104, "Asus",32000 ));
		p.add(new Product(105, "Dell",40000 ));
		
		Collections.sort(p);
		
		for(Product data:p)
		{
			System.out.println(data);
		}
	}
}

