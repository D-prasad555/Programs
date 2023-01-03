package j8.features.lambdaexpressions;

import java.util.function.BiFunction;

public class BiFunctionInterface
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> f=(a,b)->{
			return a+b;
		};
		System.out.println(f.apply(10, 20));
	}
}
