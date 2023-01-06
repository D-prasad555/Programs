package optionalclass.programs;

import java.util.Optional;

public class OptionalClassMethods 
{
	static String name;
	public static void main(String[] args)
	{
	    
		//name="Jai";
		//It returns empty optional object. No value is present for this optional
		Optional<String> optionalEmpty=Optional.empty();
		System.out.println(optionalEmpty);
		
		/*Optional<String> optionalOf=Optional.of(name);
		System.out.println(optionalOf);*/
		
		Optional<String> optionalOfNullable=Optional.ofNullable(name);
		System.out.println(optionalOfNullable);
		
		//Use get() method to retrive value from Optional class object. If Optionalclass is null then if we try to print value by using get() method we will get nullPointerExceeption
		Optional<String> optionalOfNullable2=Optional.ofNullable(name); 
		System.out.println(optionalOfNullable2.get());
		
		//Use isPresent() method to check weather Optionalclass object contains value or not.Return type of isPresent() boolean
		
	}
		
}

