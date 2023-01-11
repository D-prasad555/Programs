package j8.features.streamapi.assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _8FindAllTransactionsIn2011SortThemByValueInAscendingOrder 
{
	public static void main(String[] args) 
	{
	        // Create some traders
	        Trader raoul = new Trader("Raoul", "Cambridge");
	        Trader mario = new Trader("Mario","Milan");
	        Trader alan = new Trader("Alan","Cambridge");
	        Trader brian = new Trader("Brian","Cambridge");

	        // Create a list to store transactions
	        List<Transaction> transactions = new ArrayList<>();
	        // Add some transactions
	        transactions.add(new Transaction(brian, 2011, 300));
	        transactions.add(new Transaction(raoul, 2012, 1000));
	        transactions.add(new Transaction(raoul, 2011, 400));
	        transactions.add(new Transaction(mario, 2012, 710));
	        transactions.add(new Transaction(mario, 2012, 700));
	        transactions.add(new Transaction(alan, 2012, 950));

	        // Find all transactions in the year 2011 and sort them by value using Stream API
	        List<Transaction> transactionsIn2011 = transactions.stream()
	            .filter(t -> t.getYear() == 2011)
	            .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
	            .collect(Collectors.toList());
	        
	        // Print the sorted transactions
	        transactionsIn2011.forEach(t-> System.out.println(t.getValue()));
	    
	}

}
