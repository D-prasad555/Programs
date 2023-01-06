package optionalclass.programs;

import java.util.Optional;

public class GetMethod 
{
	public static String name="sai";
	public static void main(String[] args) 
	{
		Optional<String> optional=Optional.ofNullable(name);
		System.out.println(optional.get());
	}
}
