package arrays.programs;

public class RemoveDuplicate 
{
	public static void main(String[] args)
	{
		int arr[]= {10,23,10,43,2,34,23,34,34,100,100};
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
		for(int n=0;n<length;n++)
		{
			System.out.println(arr[n]);
		}
		
	}
}
