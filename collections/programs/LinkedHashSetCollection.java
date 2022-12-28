package collections.programs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

public class LinkedHashSetCollection 
{
	public static void main(String[] args)
	{
		LinkedHashSet<User> l=new LinkedHashSet<>();
		l.add(new User(1,"sai"));
		l.add(new User(1,"sai"));
		for(User data:l)
		{
			System.out.println(data);
		}
	}
}
class User
{
	private int id;
	private String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj)
	{
		User users=(User) obj; //Down casting
		
		return this.id==users.id&&(this.name).equals(users.name);
		
	}
	@Override
	public int hashCode()
	{
		return this.id;
	}
	public String toString()
	{
		return "Id :"+this.id+ " name :"+""+this.name;
	}

	/*@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}**/

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(name, other.name);
	}*/
}