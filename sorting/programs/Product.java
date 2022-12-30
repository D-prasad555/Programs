package sorting.programs;

public class Product implements Comparable<Product>
{
	private int id;
	private String name;
	private int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int compareTo(Product s)
	{
		if(price==s.price)
			return 0;
		else if(price<s.price)
			return -1;
		else
			return 1;
	}
	public String toString()
	{
		return id+" "+name+" "+price;
	}
}
