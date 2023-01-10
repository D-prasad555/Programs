package arrays.programs;

public class MaxValue 
{
	public static void main(String[] args)
	{
		int a[]= {10,200,21,450,3};
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
	}
}
