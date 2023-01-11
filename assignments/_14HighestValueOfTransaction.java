package j8.features.streamapi.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class _14HighestValueOfTransaction 
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
        
        int highestValue1=transactions.stream().map(s->s.getValue()).max((n1,n2)->n1.compareTo(n2)).get();
        System.out.println(highestValue1);
        
        
        OptionalInt highestValue2=transactions.stream().mapToInt(s->s.getValue()).max();
        System.out.println(highestValue2);
	}
}
