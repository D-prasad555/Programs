package thread.programs;

public class ThreadClass 
{
	public static void main(String[] args)
	{
		System.out.println("Main method start");
		ThreadDemo d=new ThreadDemo();
		Thread t=new Thread(d);
		t.start();
		System.out.println("Main method end");
	}
}
class ThreadDemo extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread class");
		}
	}
}