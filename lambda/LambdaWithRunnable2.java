package j8.features.lambda;

//With Lambda
public class LambdaWithRunnable2
{
	public static void main(String[] args)
	{
			Runnable r=()->{
				for(int i=0;i<5;i++)
				{
					System.out.println("Rummable with lambda");
				}
			};
			Thread t=new Thread(r);
			t.start();
	}
	
}


/*Without Lambda
public class LambdaWithRunnable
{
	public static void main(String[] args) 
	{
		ThreadClass t=new ThreadClass();
		t.start();
	}
}
class ThreadClass extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread class");
		}
	}
}*/