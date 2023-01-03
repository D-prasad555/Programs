package j8.features.lambdaexpressions;

import java.util.function.Consumer;

//Consumer using Method references

public class Consumer2 
{
	public static void main(String[] args)
	{
		ConsumerClass con=new ConsumerClass();
		Consumer<String> c=con::message;
		c.accept("ravi");
	}
}
class ConsumerClass
{
	public void message(String name)
	{
		System.out.println("Hello "+name);
	}
}
