package j8.features.lambdaexpressions;

import java.util.function.Consumer;

/*The Consumer Interface accepts a single argument and does not return any result
 *It contains an abstract accept() and a default andThen() method. It can be used as the assignment target 
for a lambda expression or method reference.*/

//Consumer using Lambda expression

public class Consumer1
{
	public static void main(String[] args)
	{
		Consumer<String> c=(s)->{
			System.out.println(s);
			};
			c.accept("Hello");
		
	}
}
