package methodreference.programs;

import java.util.Arrays;
import java.util.function.Function;

public class NSMArbitaryObject
{
	public static void main(String[] args)
	{
		Function<String, String> fn=(msg)->msg.toLowerCase(); //Using lambda
		System.out.println(fn.apply("HELLO"));
		
		Function<String, String> fn2=String::toLowerCase; //Using method references
		System.out.println(fn2.apply("HELLO"));
		
		String[] str= {"A","E","I","O","U","a","e","i","o","u"};
		Arrays.sort(str, (s1,s2)->s1.compareToIgnoreCase(s2));    //Using lambda
		
		Arrays.sort(str, String::compareToIgnoreCase);
	}
}
