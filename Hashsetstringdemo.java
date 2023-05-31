package collectionclasses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Hashsetstringdemo {
	
	public static void main(String[] args) {
		
		Scanner st=new Scanner(System.in);
		
		System.out.println("Please enter the string values for hashset");
		
		Set<String> hashset=new HashSet<>();
		
		hashset.add(st.next());
		hashset.add(st.next());
		hashset.add(st.next());
		hashset.add(st.next());
		
		/*hashset.add(null);
		hashset.add("Automation");
		hashset.add("Manual");
		hashset.add("QA"); */
		
		              Iterator<String> itr=hashset.iterator();
		              while(itr.hasNext())
		              {
		            	  System.out.println(itr.next());
		              }
	}

}
