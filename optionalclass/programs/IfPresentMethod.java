package optionalclass.programs;

import java.util.Optional;

public class IfPresentMethod 
{
	public static void main(String[] args)
	{
		//ifPresent() method execute code if value is present in optionalclass otherwise it didnt execute code.
		
		Optional<String> gender=Optional.of("Male");
		gender.ifPresent((s)->System.out.println("value is present"));
		
		Optional<String> empty=Optional.empty();
		empty.ifPresent((s)->System.out.println("No value is present"));
		
	}
}
