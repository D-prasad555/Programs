package methodreference.programs;

import java.util.function.Function;

/*public class StaticMethod
{
	public static void main(String[] args)
	{
		Function<Integer, Double> fn=(input)->Math.sqrt(input);
		System.out.println(fn.apply(25));
	}
}*/
public class StaticMethodSqrtMethod
{
	public static void main(String[] args)
	{
		Function<Integer, Double> fn=Math::sqrt;
		System.out.println(fn.apply(225));
	}
}
