package programs;

import java.util.Scanner;

public class CaseConverter {
	public static void main(String[] args) {
		
	Scanner st=new Scanner(System.in);
	System.out.println("Please enter the string");
	
	String str=st.nextLine();
	char[] ch = str.toCharArray();
	

			
			for(int i=0; i<=str.length();i++)
			{
				//ch=str.charAt(i);
			
				if (ch[i] >= 'A' && ch[i] <= 'Z')
					ch[i]= (char) (ch[i] + 32);
				else if( ch[i]>='a' && ch[i] <= 'z')
					ch[i]= (char) (ch[i] - 32);
				System.out.println(ch[i]);
				
			}
			
}
}