package collectionclasses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class hashsetdemo {
	
	//hashset does not follow any order
	//hashset allows unique values only
	//hashset allows only one null value
	
                    public static void main(String[] args) {
                    	
                    	Scanner sn=new Scanner(System.in); //passing the values at run time
                    	System.out.println("Please enter the values");
						
                    	Set<Integer> hashset=new HashSet<>();
                    	hashset.add(sn.nextInt()); //passing the values at run time
                    	hashset.add(sn.nextInt());
                    	hashset.add(sn.nextInt());
                    	hashset.add(sn.nextInt());
                    	hashset.add(sn.nextInt());
                    	
                    	/*declaring the constant values
                    	hashset.add(23);
                    	hashset.add(5);
                    	hashset.add(12);
                    	hashset.add(5);
                    	hashset.add(null); */
                    	
                    	//System.out.println(hashset); 
                    	
                    	System.out.println("Values of hashset");
                    	       Iterator<Integer> itr=hashset.iterator();
                    	       while(itr.hasNext())
                    	       {
                    	    	 System.out.println(itr.next());
                    	       }
                    	
					}
}
