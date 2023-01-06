package optionalclass.programs;

import java.util.Optional;

public class IfPresent
{
	public static void main(String[] args)
	{
		Optional<String> optional=Optional.ofNullable(null);
		optional.ifPresent((s)->{
			System.out.println("Value is present first statement");
		    System.out.println("Value is present second statement");
		    });
		
		Optional<String> optional2=Optional.of("hello");
		optional.ifPresent((s)->System.out.println("Obect is present"));
		Optional<String> opt=Optional.empty();
		opt.ifPresent((s)->System.out.println(" "));
	}
}
