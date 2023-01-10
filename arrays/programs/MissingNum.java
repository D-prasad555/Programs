package arrays.programs;

//WAP to find all missing numbers from 1 to 100 from an array

public class MissingNum 
{
	public static void main(String[] args) 
	{
		int arr[]= {12,23,45,2,4,34,67};
		boolean status=true;
		for(int i=1;i<=100;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])
				{
					status=false;
					break;
				}
			}
			if(status)
			{
				System.out.println(i);
			}
			status=true;
		}
	}
}
