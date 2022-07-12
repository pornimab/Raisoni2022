package Collection;

import java.util.ArrayList;

public class ArrrayListUse {

	public static void main(String[] args) {
		
		 ArrayList<Object> al = new ArrayList<>(); //generic arraylist (all types of variable allowed)
		
		 //<> symbol is not compulsory
		al.add("pornima");  //0
        al.add("kuhite");  //1
		al.add(12);  //2
		al.add(12.24);  //3
		al.add('A');  //4
		al.add("pornima");  //5
		al.add(null);  //6
		
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(12));
		System.out.println(al.get(1)); // index serial wise
		System.out.println(al.indexOf(12.24));
		System.out.println(al.indexOf("pornima"));
		System.out.println(al.lastIndexOf('A'));
	    System.out.println(al.remove(12));// AFTER EXCEPTION there is no value printing
	    System.out.println(al); 
		
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		
	}

}
