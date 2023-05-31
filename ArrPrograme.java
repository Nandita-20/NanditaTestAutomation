package First_program;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class ArrPrograme {

	
	public static void main(String[] args) {
		
		Scanner st=new Scanner(System.in);
		System.out.println("Please enter the size of the Array");
		int num=st.nextInt();
		
		int arr[]=new int[num];
		
		int i;
		System.out.println("Please enter the values for arrays");
		for (i=0; i<=num-1;i++)
		{
			
			arr[i]=st.nextInt();
			
		}
		System.out.println("Array is as given\n");
		for (i=0; i<=num-1;i++)
		{
			System.out.println("Element at index " + i + " : "+ arr[i]);
			
			
		}
		
		System.out.println("Array: " + Arrays.toString(arr)); //printing array elements without using for loop
		
		System.out.println("Printting smallest and largets value on Array\n");
		
		int b=arr[0]; 
		int s=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(b<arr[i])
			{
				b=arr[i];
			}
			else if (s>arr[i])
			{
				s=arr[i];
			}
			
		}
		System.out.println("largest values is" + b);
		System.out.println("smallest values is" + s);
		
	}
	}



