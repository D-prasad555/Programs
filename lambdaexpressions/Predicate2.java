package j8.features.lambdaexpressions;

import java.util.function.Predicate;

public class Predicate2 
{
	public static void main(String[] args)
	{
		int arr[]= {10,4,20,3,34,2,12};
		Predicate<Integer> p1=i->(i>10);
				
		for(int data:arr)
		{
			if(p1.test(data))
			{
				System.out.println(data);
			}
		}
		
	}
}
