package arrays.programs;

public class CopyArray 
{
	public static void main(String[] args)
	{
		int arr[]= {10,334,23,20,66,3000};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
		int min=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println(min);
	}
}
