package j8.features.lambdaexpressions;

import java.time.LocalDate;
import java.util.function.Supplier;

public class supplier3 
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		Supplier<LocalDate> s=date::localDate;
		System.out.println(s.get());
	}
}
class Date
{
	public LocalDate localDate()
	{
		LocalDate d=LocalDate.now();
		return d;
	}
}