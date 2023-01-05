package strings.programs;

public class FrequencyOfCharacters 
{
	public static void main(String[] args)
	{
		String s1="Javaprogram";
		String s2=s1.toLowerCase();
		char ch[]=s2.toCharArray();
		
		for(char c='a';c<='z';c++)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==c)
				{
					count++;
				}
			}
			if(count>=1)
			System.out.println(c+" "+count);
		}
	}
}
