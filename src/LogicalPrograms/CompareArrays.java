package LogicalPrograms;

import org.bouncycastle.util.Arrays;


public class CompareArrays {

	public static void main(String[] args)
	{
		int ar1[] = {10,20,30};
		int ar2[] = {40,30,50};
		int ar3[] = {20,70,30};
		
		//System.out.println(Arrays.equals(ar1,ar2));
		//System.out.println(Arrays.equals(ar2,ar3));
		//System.out.println(Arrays.equals(ar1,ar3));
		System.out.println(Arrays.areEqual(ar1, ar2));
		System.out.println(Arrays.areEqual(ar2, ar3));
		System.out.println(Arrays.areEqual(ar1, ar3));
	}

}
