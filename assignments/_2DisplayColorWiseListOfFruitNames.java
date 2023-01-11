package j8.features.streamapi.assignments;

import java.util.ArrayList;
import java.util.List;

public class _2DisplayColorWiseListOfFruitNames 
{
	public static void main(String[] args) 
	{
		List<Fruit> fruitList=new ArrayList<>();
		fruitList.add(new Fruit("apple", 160, 330, "red"));
		fruitList.add(new Fruit("banana", 50, 80, "yellow"));
		fruitList.add(new Fruit("oranges", 70, 200, "orange"));
		fruitList.add(new Fruit("grapes", 40, 120, "blue"));
	
		fruitList.stream().sorted((s1,s2)->s1.getColor().compareTo(s2.getColor())).forEach(System.out::println);
	}
}
