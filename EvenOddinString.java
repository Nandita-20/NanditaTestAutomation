package programs;

import java.util.Scanner;

public class EvenOddinString {
	public static void main(String[] args) 
	{
		Scanner st=new Scanner(System.in);
		
		System.out.println("enter the string to reverse");
		String str=st.nextLine();
		
		String result = "";
		String rest = "";
	    for(int i = 0; i < str.length(); i++)
	    {
				        if( (i%2) != 0 ){
				          result += str[i];
					} 
				        else{
					  rest += str[i];
				        }
				}
 System.out.println("result");
 System.out.println("rest");
}
}
