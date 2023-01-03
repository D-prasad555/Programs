package j8.features.lambdaexpressions;

//negate() method will give opposite results other than what we expected
import java.util.function.Predicate;

public class Predicate4Negate 
{
	public static void main(String[] args)
	{
		String names[]= {"sai","ravi","kumar","jai"};
		Predicate<String> p1=i->(i.length()>=4);
		
		for(String data:names)
		{
			if(p1.negate().test(data))
			{
				System.out.println(data);
			}
		}
	}
	
}
