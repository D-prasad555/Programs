package strings.programs;

public class StringBuilderClass 
{
	public static void main(String[] args)
	{
		StringBuilder str1=new StringBuilder("java");
		StringBuilder str2=new StringBuilder("java");
		System.out.println(str1.equals(str2));
		
		String s1="hello";
		s1.concat("world");
		System.out.println(s1);
		
		str2.append(" development");
		System.out.println(str2);
	}
}
