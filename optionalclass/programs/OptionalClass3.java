package optionalclass.programs;

import java.util.Optional;

public class OptionalClass3 
{
	public static void main(String[] args)
	{
		String s[] =new String[3];
		s[0]="sai";
		s[1]="kumar";
		s[2]="jai";
		
		//of method returns optional with non null values
		
		
		Optional<String> optional=Optional.empty();
		System.out.println(optional);
		
		
	}
}
