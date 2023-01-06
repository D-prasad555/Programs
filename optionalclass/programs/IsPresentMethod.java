package optionalclass.programs;

import java.util.Optional;

public class IsPresentMethod 
{
	static String gmail;
	public static void main(String[] args)
	{
		Optional<String> optionalOfNullable2=Optional.ofNullable(gmail);
		if(optionalOfNullable2.isPresent()) 
		{
			System.out.println(optionalOfNullable2.get());
		}
		else
		{
			System.out.println("No value is present");
		}
		
	}
}
