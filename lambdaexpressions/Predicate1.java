package j8.features.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1
{
	public static void main(String[] args)
	{
		//Check given number is greater than 10 or not
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(1));	
		
		//Check weather given string is equal or not
		Predicate<String> p2=s->(s.equals("hello"));
		System.out.println(p2.test("hello"));
		
		//Check weather given collection is empty or not
		List<Integer> list=Arrays.asList();
		Predicate<List<Integer>> p3=list2->(list2.isEmpty());
		System.out.println(p3.test(list));
	

	}
	
	

}
