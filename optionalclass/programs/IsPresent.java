package optionalclass.programs;

import java.util.Optional;

public class IsPresent 
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.setName("sai");
		
	    Optional<String> optional=d.getName();
	    if(optional.isPresent())
	    {
	    	System.out.println("Object is not empty");
	    }
	    else
	    {
	    	System.out.println("object is empty");
	    }
	
	}
	
}
class Demo
{
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	public Optional<String> getName()
	{
		return Optional.ofNullable(name);
		
	}
}