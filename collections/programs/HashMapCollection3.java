package collections.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection3 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Product> map=new HashMap<>();
		Product p1=new Product(101, "Dell",40000);
		Product p2=new Product(102, "Hp",35000);
		Product p3=new Product(103, "Lenovo",43000);
		Product p4=new Product(104, "Mi",41000);
		map.put(p1.getpId(), p1);
		map.put(p2.getpId(), p2);
		map.put(p3.getpId(), p3);
		map.put(p4.getpId(), p4);
		for(Map.Entry<Integer, Product> data:map.entrySet())
		{
			if(data.getValue().getPrice()>40000)
			{
				System.out.println("Product Id :"+data.getKey()+" "+"Name :"+data.getValue().getpName()+"  "+"Price :"+data.getValue().getPrice());
			}
		}
	}
}
class Product
{
	private int pId;
	private String pName;
	private int price;
	public Product(int pId, String pName, int price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
