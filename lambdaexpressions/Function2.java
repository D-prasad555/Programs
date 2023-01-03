package j8.features.lambdaexpressions;

import java.util.function.Function;

public class Function2
{
	public static void main(String[] args)
	{
		int n[]= {10,22,45,67,33,45,30};
		
		Function<Integer, Boolean> f=i->(i%2==0);
		
		for(Integer data:n)
		{
			if(f.apply(data))
			{
				System.out.println(data);
			}
		}
	}
}
