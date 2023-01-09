package j8.features.lambda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConvertKeyValueOfMapIntoString 
{
	public static void main(String[] args)
	{
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "sai");
		map.put(2, "arun");
		map.put(3, "kumar");
		
		StringBuilder str=new StringBuilder(" ");
		BiFunction<Integer, String, String> bi=(s1,s2)->s1+"="+s2+" ";
		
		for(Map.Entry<Integer, String> data:map.entrySet())
		{
			str=str.append(bi.apply(data.getKey(), data.getValue()));
		}
		System.out.println(str);
	}
}
