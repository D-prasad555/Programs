package j8.features.streamapi.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _7DisplayCommentByUserWiseNumberOfComments 
{
	public static void main(String[] args)
	{
		List<String> commentByUserRam=Arrays.asList("Post about environment","Post about pollution","Post about high temperature");
		List<String> commentByUserRaj=Arrays.asList("Post about new movies","post about old movies");
		List<String> commentByUserSai=Arrays.asList("Post about politics");
	
		List<String> commentsOfRam= Arrays.asList("good information","nice post");
		List<String> commentsOfRaj= Arrays.asList("nice movies");
		List<String> commentsOfSai = Arrays.asList("This is current politics","good info");
		
		List<News> newsData=new ArrayList<>();
		newsData.add(new News(1, "ram", commentByUserRam,commentsOfRam ));
		newsData.add(new News(3, "raj", commentByUserRaj,commentsOfRaj));
		newsData.add(new News(2, "sai", commentByUserSai,commentsOfSai ));
		
		Map<List<String>, Long> commentsCount=newsData.stream()
		.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
		commentsCount.forEach((user,count)->System.out.println(user+": "+count));
		
	}
}
