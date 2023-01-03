package j8.features.lambdaexpressions;

import java.util.function.Function;

public class Function1 
{
	public static void main(String[] args)
	{
		String str[]= {"sai","kumar","raj"};
		
		Function<String, String> p1=i->(i.toUpperCase());
		function(p1,str);
	
	}
	
	public static void function(Function<String, String> p, String s[])
	{
		for(String data:s)
		{
			System.out.println(p.apply(data));
		}
	}
}