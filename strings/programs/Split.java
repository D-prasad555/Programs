package strings.programs;

public class Split 
{
	public static void main(String[] args)
	{
		String s1="full stack java";
		String s2[]=s1.split(" ");
		for(String data:s2)
		{
			System.out.println(data);
		}
		
		String s3="java";
		String s4[]=s3.split("");
		for(String data:s4)
		{
			System.out.println(data);
		}
	}
}
