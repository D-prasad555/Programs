package j8.features.innerclass;

public class InnerClass3
{
	public static void main(String[] args)
	{
		Division d=new Division() {
			public void div(int a,int b)
			{
				System.out.println(a/b);
			}
		};
		d.div(200, 20);
	}
}
interface Division
{
	void div(int a,int b);
}