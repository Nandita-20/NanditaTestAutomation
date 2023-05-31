package First_program;

import java.util.Scanner;

public class asciiprogram {
public static void main(String[] args) {
	
	Scanner st=new Scanner(System.in);
	System.out.println("Please enter the string");
	
	String str=st.nextLine();
	char[] ch = str.toCharArray();
	//char ch,ch1;
	int av;

			
			/*for(int i=0; i<=str.length()-1;i++)
			{
				//ch=str.charAt(i);
			
				if (ch[i] >= 'A' && ch[i] <= 'Z')
					ch[i]= (char) (ch[i] + 32);
				
			}
			for(int i=0; i<=str.length()-1;i++)
			{
			System.out.println(ch[i]);
			}
			*/
			/*for(int i=1; i<=str.length()-1;i+=2)
			{
				//if(i%2==0)
					System.out.println(ch[i]);
				
			}*/
			
			for(int i=1; i<=str.length()-1;i++)
			{
				if(i%2==0)
					System.out.println(ch[i]);
				
			}
			
			}}
			


