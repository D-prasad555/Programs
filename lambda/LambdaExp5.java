package j8.features.lambda;

public class LambdaExp5 
{
	public static void main(String[] args)
	{
		Addition ad=new Addition(){
			public void add(int a,int b)
			{
				System.out.println(a+b);
			}
		};
		ad.add(10, 20);
	}
}
abstract class Addition
{
	public abstract void add(int a,int b);
}