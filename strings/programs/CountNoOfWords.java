package strings.programs;

public class CountNoOfWords 
{
	public static void main(String[] args) 
	{
		String s1=" Iam a java developer ";
		String s2=s1.trim();
		int count=1;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)==' '&&s2.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
