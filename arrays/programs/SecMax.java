package arrays.programs;

public class SecMax 
{
	public static void main(String[] args)
	{
		int arr[]= {10,200,34,56,7,100};
		int max=arr[0];
		int secMax=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>secMax)
			{
				secMax=arr[i];
			}
		}
		System.out.println(secMax);
	}
}
