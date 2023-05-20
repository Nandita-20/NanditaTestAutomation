package programs;

import java.util.Scanner;

public class MethodReturntype {
	
	public static int sumint(int a, int b) //parameters of menthod
	{
		int c=a+b;
		return c;
	}
	
	public String sumstring(String a, String b)
	{
	String g=a+b;
	return g;
	}
	
	public double sumnum(double a, int b)
	{
		double d=a+b;
		return d;
	}

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enetr the value for a1 and b1");
		int a1= sn.nextInt();
		int b1= sn.nextInt();
		
	int result = sumint(a1,b1); //arguments of method
	System.out.println(result);
	
	MethodReturntype md=new MethodReturntype();
	
	String stresult=md.sumstring("Java", "Automation");
	System.out.println(stresult);
		
	double dresult=md.sumnum(2.4, 5);
	System.out.println(dresult);
	
	}
}
