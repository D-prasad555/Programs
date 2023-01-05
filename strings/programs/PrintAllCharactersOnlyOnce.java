package strings.programs;

public class PrintAllCharactersOnlyOnce 
{
	public static void main(String[] args)
	{
		String s1="javajavajavadevdev";
		String s2="";
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(s2.indexOf(ch)==-1)
			{
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}
	
	
}
