package j8.features.dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonalTime 
{
	public static void main(String[] args)
	{
		//ZoneId object can be used to represent Zone
		
		ZoneId id=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zId=ZonedDateTime.now(id);
		System.out.println(zId);
	}
}
