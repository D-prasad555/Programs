package optionalclass.programs;

import java.util.Optional;

public class FilterMethod 
{
	public static void main(String[] args)
	{
		String result = " abc ";

		if(result != null && result.contains("abc")) //Normal way of filtering
		{
			System.out.println(result);
		}
		Optional<String> optionalStr = Optional. of (result);
		optionalStr.filter(res -> res.contains("abc")).map(String::trim)//Filtering using optional class filter method
		.ifPresent((res) -> System.out.println(res));
	}
}
	

	// map method in Optional provides a way to transform value in Optional from one type to another.
	
	
