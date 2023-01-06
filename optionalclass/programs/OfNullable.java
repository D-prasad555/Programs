package optionalclass.programs;

import java.util.Optional;

public class OfNullable 
{
	static String name;
	public static void main(String[] args)
	{
		Optional<String> optional=Optional.ofNullable(name);
		System.out.println(optional);
	}
}
