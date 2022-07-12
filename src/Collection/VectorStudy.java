package Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
	Vector V=new Vector();
	V.add("nagpur");
	V.add('A');
	V.add("advika");
	V.add(null);
	V.add(234);
	V.add(2.34);
	
	System.out.println(V.elementAt(1));
	System.out.println(V.get(2));
	System.out.println(V.firstElement());
	System.out.println(V);
	System.out.println(V.remove(2.34));
	System.out.println(V);
	
	System.out.println("==============================");
	
	//for loop
	//for each
	//iterator
	//listiterator
	
  ListIterator ltr = V.listIterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
		
	}
	System.out.println("==============================");
	
	Enumeration em = V.elements();
	
	while(em.hasMoreElements())
	{
	System.out.println(em.nextElement());
	}
	
	System.out.println("==============================");
	//for each
	
	for(Object F:V)
	{
		System.out.println(F);
	}
	
	
	
	
	
	
	
	
	
	}

}
