package optionalclass.programs;

import java.util.Optional;

public class OrElseGetMethod 
{
	static String gmail;
	public static void main(String[] args)
	{
	    //orElseGet() method returns value if value is present if value is not present default value if there is no value.Its return type is String.
		//Takes lambda expression as a argument
		//gmail="durga@gmail.com";
		Optional<String> optionalOfNullable=Optional.ofNullable(gmail);
		String defaultValue=optionalOfNullable.orElseGet(()->"default@gmail.com");
		System.out.println(defaultValue);
		
	}
}
