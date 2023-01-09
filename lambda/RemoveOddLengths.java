package j8.features.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveOddLengths 
{
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("oranges");
		list.add("pinapple");
		
		list.removeIf(s->s.length()%2==1);
		list.forEach(System.out::println);
		
		
	}
}

