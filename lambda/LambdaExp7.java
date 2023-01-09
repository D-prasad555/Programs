package j8.features.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExp7 
{
	public static void main(String[] args)
	{
		List<String> words=Arrays.asList("apple","banana","cherry");
		StringBuilder result=new StringBuilder();
		words.forEach(s->result.append(s.charAt(0)));
		System.out.println(result);
		
		String firstLetters=result.toString();
		System.out.println(firstLetters);
	}
}
