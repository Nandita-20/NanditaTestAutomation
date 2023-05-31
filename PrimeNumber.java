package programs;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int i=2, count=0,n;
		Scanner st = new Scanner(System.in);
		System.out.println("Please enter the number to check prime number");
		
		n=st.nextInt();
		
		for(i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		
		if(count==0)
		{
			System.out.println("Entered number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
