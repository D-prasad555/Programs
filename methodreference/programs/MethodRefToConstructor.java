package methodreference.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodRefToConstructor 
{
	public static void main(String[] args)
	{
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Banana");
		
		Function<List<String>, Set<String>> fr=(fruitlist)->new HashSet<>(fruitlist); //Using lambda
		System.out.println(fr.apply(fruits));
		
		Function<List<String>, Set<String>> fr2=HashSet::new; //Using method references
		System.out.println(fr2.apply(fruits));
	}
}
