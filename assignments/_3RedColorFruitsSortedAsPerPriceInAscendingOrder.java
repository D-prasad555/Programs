package j8.features.streamapi.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3RedColorFruitsSortedAsPerPriceInAscendingOrder
{
	public static void main(String[] args) 
	{
		List<Fruit> fruitList=new ArrayList<>();
		fruitList.add(new Fruit("apple", 160, 330, "red"));
		fruitList.add(new Fruit("banana", 50, 80, "yellow"));
		fruitList.add(new Fruit("cherry", 90, 110, "red"));
		fruitList.add(new Fruit("oranges", 70, 200, "orange"));
		fruitList.add(new Fruit("grapes", 40, 120, "blue"));
		fruitList.add(new Fruit("strawberry", 200, 150, "red"));
		
		List<Fruit> fruitNames=fruitList.stream().filter(s->s.color.equals("red"))
		.sorted((p1,p2)->(p1.price - p2.price)).collect(Collectors.toList());
		fruitNames.forEach(System.out::println);
	}
}
