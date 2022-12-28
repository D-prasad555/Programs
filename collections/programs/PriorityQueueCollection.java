package collections.programs;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCollection 
{
	public static void main(String[] args)
	{
		Queue<Integer> q=new PriorityQueue<>();
		q.add(100);
		q.add(200);
		q.add(300);
		q.add(400);
		q.add(500);
		
		//System.out.println(q.offer(600));
		//System.out.println(q.remove());
		//System.out.println(q.remove(600));
		System.out.println(q.element());
		while(q.poll()!=null)
		{
			if(q.peek()!=null)
			System.out.println(q.peek());
		}
		
		
		//System.out.println(q.poll());
		//System.out.println(q.peek());
		
		
		
		
		/*Iterator<Integer> itr=q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
	/*	for(Integer data:q)
		{
			System.out.println(data);
		}*/
	}
}
