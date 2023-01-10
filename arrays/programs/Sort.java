package arrays.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort 
{
	public static void main(String[] args)
	{
		/*int [] arr= {11, 2, 5, 3, 2, 55, 32, 34};
		List<Integer> list=Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		Collections.sort(list);*/
		
		Stream<Integer> st=Stream.of(11, 2, 5, 3, 2, 55, 32, 34);
		st.sorted();
		List<Integer> list2=st.collect(Collectors.toList());
		for(Object data:list2)
		{
			System.out.println(data);
		}
	}
}