package j8.features.lambdaexpressions;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier2
{
	public static void main(String[] args)
	{
		Supplier<Integer> s=Supplier2::random;
		System.out.println(s.get());
	}
	public static int random()
	{
		
		int random=new Random().nextInt(100);
		if(random<10)
		{
			random=random+10;
		}
		return random;
	}
}
