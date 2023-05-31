package collectionclasses;

import java.util.HashSet;
import java.util.Set;

public class IntersectionandUnionofSet {
	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<>();
		set1.add(2);
		set1.add(22);
		set1.add(23);
		set1.add(11);
		set1.add(25);
		set1.add(null);
		
		System.out.println("Values of set1" +set1);
		
		Set<Integer> set2=new HashSet<>();
		set2.add(2);
		set2.add(23);
		set2.add(23);
		set2.add(11);
		set2.add(25);
		set2.add(27);
		set2.add(10);
		set2.add(null);
		
		System.out.println("Values of set1" +set2);
		
		set1.retainAll(set2); //Intersection of set
		//set1.addAll(set2);      //Union of set
		
		System.out.println("Set after intersection" +set1);
		//System.out.println("Set after union" +set1);
		
	}

}
