package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class LinkedListStudy {


	public static void main(String[] args) {
		
		LinkedList ls=new LinkedList();
		
		ls.add("swapnil");
		ls.add(null);
		ls.add(45);
		ls.add(12.12);
		ls.add(true);
		ls.add(null);

		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		System.out.println(ls.peek());//
		System.out.println(ls);
		System.out.println(ls.pop()); //removes top element from set not the random element and returns the removed elements 
		System.out.println(ls.poll()); // use to fetch or to remove the first element of the queue
		System.out.println(ls.size());
		
		//for loop
		//for each
		//iterator
		//listiterator
		
		//for each
		
		System.out.println("======================================");
	
		for(Object d:ls)
		{
			System.out.println(d);
		}
			
		//listIterator
		
		System.out.println("======================================");
		
	ListIterator ltr = ls.listIterator();
		
	while (ltr.hasNext())
	{
		System.out.println(ltr.next());
		
	}
	
	System.out.println("======================================");

	// for loop

	for(int s = 0;s<=ls.size()-1;s++)
	{
		System.out.println(ls.get(s));
	
	}
	
	//iterator	
	System.out.println("======================================");
	
	Iterator tr = ls.iterator();
	while(tr.hasNext())
	{
		System.out.println(tr.next());
	}
	
	}

}
