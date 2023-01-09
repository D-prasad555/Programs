package j8.features.lambda;


//With lambda
public class LambdaExp3
{
	public static void main(String[] args) 
	{
		ArithmeticOperation ad=(a,b)->{
			int n=200;
			System.out.println(a+b+n);
		};
		ad.addition(10, 20);
	}
}
@FunctionalInterface
interface ArithmeticOperation
{
	void addition(int a,int b);
}


//Without lambda
/*public class LambdaExp1 
{
	public static void main(String[] args)
	{
		Addition2 ad=new Addition2();
		ad.add(10, 20);
	}
}
@FunctionalInterface
interface Addition
{
	void add(int a,int b);
}
class Addition2 implements Addition
{
	public  void add(int a,int b)
	{
		System.out.println(a+b);
	}
}*/


