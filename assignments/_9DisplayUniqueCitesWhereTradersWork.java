package j8.features.streamapi.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _9DisplayUniqueCitesWhereTradersWork 
{
	public static void main(String[] args)
	{
		 // Create some traders
		Trader alice = new Trader("Alice", "Cambridge");
        Trader bob = new Trader("Bob", "dilhi");
        Trader charlie = new Trader("Charlie", "Cambridge");
        Trader dan = new Trader("Dan", "London");
        Trader edward = new Trader("Edward", "Hydrabad");
       /* Trader raoul = new Trader("Raoul", "Hyderabad");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");*/

        // Create a list to store transactions
      /*  List<Transaction> transactions = new ArrayList<>();
        // Add some transactions
        transactions.add(new Transaction(brian, 2011, 300));
        transactions.add(new Transaction(raoul, 2012, 1000));
        transactions.add(new Transaction(raoul, 2011, 400));
        transactions.add(new Transaction(mario, 2012, 710));
        transactions.add(new Transaction(mario, 2012, 700));
        transactions.add(new Transaction(alan, 2012, 950));*/
        List<Transaction> transactions = Arrays.asList(
                new Transaction(bob, 2011, 300), 
                new Transaction(alice, 2012, 1000),
                new Transaction(charlie, 2011, 400),
                new Transaction(dan, 2012, 710),
                new Transaction(edward, 2011, 760)
            );
        
        /*List<String> uniqueCities = 
                transactions.stream()
                       .map(s -> s.getTrader().getCity())
                       .collect(Collectors.toList());

            List<String> nonRepeatedCities =  uniqueCities.stream()
                       .filter(city -> Collections.frequency(uniqueCities, city)==1)
                       .collect(Collectors.toList());

            System.out.println(nonRepeatedCities);*/
        List<String> uniqueCities=transactions.stream().map(s->s.getTrader().getCity()).collect(Collectors.toList());
        
       List<String> nonRepeatedCities=uniqueCities.stream().filter(city->Collections.frequency(uniqueCities, city)==1)
    		   .collect(Collectors.toList());
       System.out.println(nonRepeatedCities);
	}
}
