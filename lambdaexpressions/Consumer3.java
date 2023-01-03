package j8.features.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*The mapToInt() method returns an IntStream consisting of the results of applying the given function to the 
 * elements of this stream. 
 * Integer is a class it consists of static intValue() method. intValue() method converts Integer type object to int
 * sum() is a built-in method in java which returns the sum of its arguments(int values)
 */

public class Consumer3 
{
	public static void main(String[] args) 
	{
		List<Integer> list1=Arrays.asList(12,34,22,45,65,39);
		Consumer<List<Integer>> consumer1=ConsumerSum::sum1;
		consumer1.accept(list1);
		
		List<Double> list2=Arrays.asList(12.55,34.34,22.56,45.23,65.8,39.69);
		Consumer<List<Double>> consumer2=ConsumerSum::sum2;
		consumer2.accept(list2);
	}
}
class ConsumerSum
{
	
	public static void sum1(List<Integer> list)
	{
		int sum=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
	public static void sum2(List<Double> list)
	{
		double sum=list.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println(sum);
	}
	
}
