package arrays.programs;

public class MaxNumber 
{
	public static void main(String[] args)
	{
		int a[]= {1,10000,300,3,22,40,2300};
	    int min=a[0];
		for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]<min)
	    	{
	    		min=a[i];
	    	}
	    }
		System.out.println(min);
	}
}
