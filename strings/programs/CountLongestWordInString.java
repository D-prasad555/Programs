package strings.programs;

public class CountLongestWordInString 
{
	public static void main(String[] args) 
	{
		String s1="Iam a java developer";
		String s2[]=s1.split(" ");
		int max=0;
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].length()>max)
			{
				max=s2[i].length();
			}
		}
		System.out.println(max);
	}
}
