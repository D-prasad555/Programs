package optionalclass.programs;

import java.util.Optional;

public class OrElseThrowMethod
{
	static String gmail;
	public static void main(String[] args)
	{
		//orElseThrow() method returns value if value is present if value is not present throws exception.
		//Its return type is String.Takes String as argument
		//gmail="durga@gmail.com";
		Optional<String> optionalOfNullable=Optional.ofNullable(gmail);
		String defaultValue=optionalOfNullable.orElseThrow(()->new IllegalArgumentException("default@gmail.com is not found"));
		System.out.println(defaultValue);
	}
}
