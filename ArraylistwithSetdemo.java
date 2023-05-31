package collectionclasses;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraylistwithSetdemo { //remove dulpicate elements from array list

	public static void main(String[] args) {
		
		Scanner st=new Scanner(System.in);
		//st.nextInt();
		System.out.println("Enter the values for Array list");
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		for(int i=0;i<=5;i++)
		{
			arr.add(st.nextInt());
		}
		
		System.out.println("ArrayList with duplicate values" +arr);
		
		Set<Integer> linkedhashset = new LinkedHashSet<>(arr);
		ArrayList<Integer> arr1=new ArrayList<>(linkedhashset);
		
		System.out.println("ArrayList with unique values" +arr1);
                System.out.println("ArrayList with unique values" +arr1);
		
	}
}
