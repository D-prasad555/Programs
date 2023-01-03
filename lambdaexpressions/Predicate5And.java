package j8.features.lambdaexpressions;

import java.util.function.Predicate;

public class Predicate5And 
{
	public static void main(String[] args)
	{
		//Write 2 predicates to verify weather given string start with S and having greater than 6 characters
		
		String str[]={"sai kumar","arun sai","rajesh","karun sharma"};
		
		Predicate<String> p1=i->(i.startsWith("s"));
		
		Predicate<String> p2=i->(i.length()>=6);
		
		
		for(String data:str)
		{
			if(p1.and(p2).test(data))
			{
				System.out.println(data);
			}
		}
		
		
		
		
		/*int arr[]= {15,9,3,17,89,340,33};
		
		Predicate<Integer> p1=i->(i>15&&i<90);
		
		for(Integer data:arr)
		{
			if(p1.test(data))
			{
				System.out.println(data);
			}
		}*/
	}
}
