package j8.features.streamapi.assignments;

import java.util.Arrays;
import java.util.List;

public class _15LowestValueOfTransaction 
{
	public static void main(String[] args) 
	{

		Trader alice = new Trader("Alice", "Cambridge");
        Trader bob = new Trader("Bob", "dilhi");
        Trader charlie = new Trader("Charlie", "Cambridge");
        Trader dan = new Trader("Dan", "London");
        Trader edward = new Trader("Edward", "Hydrabad");
        
        List<Transaction> transactions = Arrays.asList(
                new Transaction(bob, 2011, 300), 
                new Transaction(alice, 2012, 1000),
                new Transaction(charlie, 2011, 400),
                new Transaction(dan, 2012, 710),
                new Transaction(edward, 2011, 760)
            );
        
        int lowestValue=transactions.stream().map(s->s.getValue()).min((n1,n2)->n1.compareTo(n2)).get();
        System.out.println(lowestValue);
	}
}
