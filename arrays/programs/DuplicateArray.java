package arrays.programs;

public class DuplicateArray 
{
	public static void main(String[] args)
	{
		int arr[]= {1,6,9,9,6, 2, 2, 3, 4, 4, 4, 5, 5};
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					for(int m=j;m<length-1;m++)
					{
						arr[m]=arr[m+1];
						
					}
					length--;
					j--;
					
				}
			}
		}
		for(int k=0;k<length;k++)
		{
			System.out.println(arr[k]);
		}
	}
}
