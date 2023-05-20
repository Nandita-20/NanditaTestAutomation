package First_program;

import java.util.Random;
import java.util.Scanner;

public class randomprogram {
	
public static void main(String[] args) {
	
	Scanner st=new Scanner(System.in);
	System.out.println("Enter any number from 1 to 9");
	int num=st.nextInt();
	
	Random rm=new Random();
	int r=rm.nextInt();
	
	if(num==r)
	{
		System.out.println("Guess is correct");
	}
	else
	{
		System.out.println("Guess is not correct");
	}
	
			
}

}
