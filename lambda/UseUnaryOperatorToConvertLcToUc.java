package j8.features.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UseUnaryOperatorToConvertLcToUc 
{
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("oranges");
		
		/*UnaryOperator<String> un=(s)->s.toUpperCase(); 
		
		for(String data:list)
		{
			System.out.println(un.apply(data));
		}*/
		
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list);
	}
}
