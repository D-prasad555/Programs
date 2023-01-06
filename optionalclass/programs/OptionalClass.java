package optionalclass.programs;

import java.util.Optional;

public class OptionalClass 
{
	public static void main(String[] args)
	{
		User user =new User();
	    user.setUserName("");
	     
	    Optional<String> optional=user.getUserName();
	    Optional<String> optional2=Optional.of("hi");
	    if(optional.equals(optional2))
	    {
	    	System.out.println("Object is not null");
	    }
	    else
	    {
	    	System.out.println("Object is null");
	    }
	}	
}
class User
{
	private String userName;
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	
	public Optional<String> getUserName()
	{
		return Optional.ofNullable(userName);
	}
}