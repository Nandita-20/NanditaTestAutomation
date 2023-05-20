package programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) 
	{
		Scanner st=new Scanner(System.in);
		
		System.out.println("enter the string to reverse");
		String str=st.nextLine();
		
		char[] chr = str.toCharArray();
		String r="";
		String r1="";
		
		for(int i=chr.length-1;i>=0;i--) //To reverse the word
		{
			r=r+chr[i];
		}
		System.out.println(r);
		System.out.println("*******************************************");
		System.out.println("enter the sentence to reverse");
		String str1=st.nextLine();
		
		for(int i=str1.length()-1;i>=0;i--) //To reverse string
		{
			r1=r1+str1.charAt(i);
		}
		
		System.out.println(r1);
	}

}
