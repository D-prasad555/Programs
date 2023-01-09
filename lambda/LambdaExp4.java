package j8.features.lambda;

public class LambdaExp4 
{
	public static void main(String[] args) 
	{
		Square sq=(s)->{
			
			return s*s;
		};
		System.out.println(sq.sqr(10));
	}
}
interface Square
{
	int  sqr(int s);
}

