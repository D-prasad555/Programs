package j8.features.lambda;

public class LambdaExpWithReturnType1
{
	public static void main(String[] args)
	{
		Multiplication m=(a,b)->{
			int c=a*b;
			return c;
		};
		//System.out.println(m.multi(10,20));
		int d=m.multi(20, 30);
		System.out.println(d);
	}
}
interface Multiplication
{
	int  multi(int a,int b);
}
