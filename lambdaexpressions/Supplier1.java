package j8.features.lambdaexpressions;

import java.util.function.Supplier;

/*Supplier is a functional interface it consists of get() method. It will not take any input. 
  Just pass required object. It will return results we have to specify return type*/

public class Supplier1 
{
	public static String s="andriod";
	
	public static void main(String[] args)
	{
		Supplier<Boolean> s1=()->s.length()>3;
		System.out.println(s1.get());
		
		Supplier<String> s2=()->s.toUpperCase();
		System.out.println(s2.get());
	}
}
