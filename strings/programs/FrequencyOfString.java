package strings.programs;

public class FrequencyOfString
{
	public static void main(String[] args)
	{
		String str1="we work to live and live to be happy live"; 
		String str2="live";
		String str3[]=str1.split(" ");
		int count=0;
		for(int i=0;i<str3.length;i++)
		{
			if(str2.equals(str3[i]))
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
