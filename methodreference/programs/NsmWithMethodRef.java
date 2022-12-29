package methodreference.programs;

/*public class NsmWithMethodRef 
{
	public static void main(String[] args)
	{
		MethodRef m=(msg)->System.out.println(msg); 
		m.display("Hello");
	}
}

interface MethodRef
{
	void display(String msg);

}*/
public class NsmWithMethodRef 
{
	public static void main(String[] args)
	{
		MethodRef m=new MethodRef();
		
		Printable p=(msg)->m.display(msg);  //Printable p=m::display;
		p.print("Hello");
	}
}

interface Printable
{
	void print(String msg);

}
class MethodRef
{
	public void display(String msg)
	{
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
}
