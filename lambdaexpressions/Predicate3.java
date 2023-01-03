package j8.features.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate3 
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(10,200,23,45,65,2,5);
		Predicate<Integer> p1=i->(i%2==0);
		
		for(Integer data:list)
		{
			if(p1.test(data))
			{
				System.out.println(data);
			}
		}
	}
}
