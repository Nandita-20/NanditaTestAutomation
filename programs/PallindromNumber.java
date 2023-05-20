package programs;

import java.util.Scanner;

public class PallindromNumber {
public static void main(String[] args) {
	Scanner st=new Scanner(System.in);
	System.out.println("Please enter the number to verify the number to verify the Pallindrome");
	int num=st.nextInt();
	int i, sum=0,n,a;
	n=num;
	
	while(num>0)
	{
		a=num%10; //121 = 1
		sum=(sum*10)+a;
		num=num/10;
		
		}
	if(n==sum)
		System.out.println("Given number is Pallindrome");
	else
		System.out.println("Given number is not Pallindrome");
	
}
}
