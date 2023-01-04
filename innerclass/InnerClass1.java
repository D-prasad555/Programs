package j8.features.innerclass;

//Using inner class with lambda
public class InnerClass1
{
	public static void main(String[] args)
	{
		A a=new A(){
			public void add(int a,int b)
			{
				System.out.println(a+b);
			}
		};
		a.add(10, 20);
	}
}
abstract class A
{
	public abstract void add(int a,int b);
}

/* Conventional way of implementing abstract method of class
public class InnerClass 
{
	public static void main(String[] args)
	{
		B b=new B();
	}
}
abstract  class A
{
	public abstract  void move();
}
class B extends A
{
	public void move()
	{
		System.out.println("This is class B");
	}
}*/