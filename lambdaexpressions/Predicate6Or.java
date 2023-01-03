package j8.features.lambdaexpressions;

import java.util.function.Predicate;

public class Predicate6Or 
{
	public static void main(String[] args)
	{
		
			//Write 2 predicates to verify weather given string start with S or having greater than 6 characters
			
			String str[]={"sai kumar","arun sai","rajesh","karun sharma"};
			
			Predicate<String> p1=i->(i.startsWith("s"));
			Predicate<String> p2=i->(i.length()>=6);
			
			
			for(String data:str)
			{
				if(p1.or(p2).test(data))
				{
					System.out.println(data);
				}
			}
			
		
	}
}
