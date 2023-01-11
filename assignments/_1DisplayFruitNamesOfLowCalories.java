package j8.features.streamapi.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _1DisplayFruitNamesOfLowCalories
{
	public static void main(String[] args)
	{
		List<Fruit> fruitList=new ArrayList<>();
		fruitList.add(new Fruit("apple", 160, 330, "red"));
		fruitList.add(new Fruit("banana", 50, 80, "yellow"));
		fruitList.add(new Fruit("oranges", 70, 200, "orange"));
		fruitList.add(new Fruit("grapes", 40, 120, "blue"));
	
			
		
		//Method 1 Sorting stream elements in ascending order
		//Return type of comparator 
		List<Fruit> fruitNames2=fruitList.stream().filter(fruit->fruit.calories<100)
		.sorted((s1,s2)->(s1.getCalories()-s2.getCalories())).collect(Collectors.toList());
		System.out.println(fruitNames2);
		
		
		//Method 2 Sorting stream elements in ascending order using Comparator.comparingInt() method
		List<Fruit> fruitNames3=fruitList.stream().filter(fruit->fruit.calories<100)
		.sorted(Comparator.comparingInt(Fruit::getCalories)).collect(Collectors.toList());
		System.out.println(fruitNames3);
		
		//Method 1 Sorting stream elements in descending order
		List<Fruit> fruitNames4=fruitList.stream().filter(fruit->fruit.calories<100)
		.sorted((s1,s2)->(s2.getCalories()-s1.getCalories())).collect(Collectors.toList());
		System.out.println(fruitNames4);
				
				
		//Method 2 Sorting stream elements in descending order using Comparator.comparingInt() method
		List<Fruit> fruitNames5=fruitList.stream().filter(fruit->fruit.calories<100)
		.sorted(Comparator.comparingInt(Fruit::getCalories).reversed()).collect(Collectors.toList());
		System.out.println(fruitNames5);
	}
	
}
