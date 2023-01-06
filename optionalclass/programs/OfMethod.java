package optionalclass.programs;

import java.util.Optional;

public class OfMethod 
{
	public static void main(String[] args) 
	{
		String s[]=new String[3];
		s[0]="apple";
		s[1]="mango";
		s[2]="orange";
		
		Optional<String> optional=Optional.of(s[2]);
		System.out.println(optional);
	}
}
