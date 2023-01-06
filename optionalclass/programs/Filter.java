package optionalclass.programs;

import java.util.Optional;

public class Filter 
{
	public static void main(String[] args) 
	{
		Optional<String> opt=Optional.of("abc");
		opt.filter((s)->s.contains("abc")).ifPresent((s)->System.out.println(opt.get()));
				
			
	}
}
