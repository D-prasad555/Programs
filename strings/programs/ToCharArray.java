package strings.programs;

public class ToCharArray 
{
	public static void main(String[] args) 
	{
		String s1="java program";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
