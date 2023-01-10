package arrays.programs;

import java.util.Scanner;

public class ArrayUsingScanner 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter "+size+" array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		
		System.out.println("Reversing array");
		for(int k=arr.length-1;k>=0;k--)
		{
			System.out.println(arr[k]);
		}
	}
}
