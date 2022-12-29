package methodreference.programs;

import java.util.function.BiFunction;

/*public class StaticMethodAddition
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> bi=(a,b)->StaticMethodAddition.add(a, b);
		System.out.println(bi.apply(10, 20));
	}
	public static Integer add(int a,int b)
	{
		return a+b;
	}
	

}*/
public class StaticMethodAddition
{
	public static Integer add(int a,int b)
	{
		return a+b;
	}
    public static void main(String[] args)
    {
    	BiFunction<Integer, Integer, Integer> bi=StaticMethodAddition::add;
    	System.out.println(bi.apply(100, 200));
    }
}

