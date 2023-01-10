package arrays.programs;

public class ThirdMax 
{
	public static void main(String[] args)
	{
		int arr[]= {87,34,45,234,67,90,10};
		int max=arr[0];
		int secMax=arr[0];
		int thirdMax=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>secMax)
			{
				thirdMax=secMax;
				secMax=arr[i];
			}
			else if(arr[i]>thirdMax)
			{
				thirdMax=arr[i];
			}
		}
		System.out.println(thirdMax);
	}
}
