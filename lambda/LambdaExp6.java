package j8.features.lambda;

public class LambdaExp6
{
	public static void main(String[] args) 
	{
		Subtraction s=new Subtraction() {
			
			@Override
			public void sub(int a, int b) {
				System.out.println(a+b);
				
			}
		};
		s.sub(200, 100);
	}
}
interface Subtraction
{
	void sub(int a,int b);
}