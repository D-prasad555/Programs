package optionalclass.programs;

import java.util.Optional;

public class OrElseMethod 
{
	static String gmail;
	public static void main(String[] args)
	{
		//orElse() method returns value if value is present, if value is not present default value will be excecuted.
		//Its return type is String.Takes String as argument
		//gmail="durga@gmail.com";
		Optional<String> optionalOfNullable=Optional.ofNullable(gmail);
		String defaultValue=optionalOfNullable.orElse("default@gmail.com");
		System.out.println(defaultValue);
		
	}
}
