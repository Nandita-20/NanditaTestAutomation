package First_program;

public class simple_program {
 public static void main(String[] args)
 {
	 int n=10,i,f=1;
	 
	 for (i=0;i<=n;i++)
	 {
		 if (i % 2==0)
		 {
			 System.out.println("even");
		 }
		 else 
		 {
			 System.out.println("odd");
		 }
	 }
	 System.out.println("Hello");
	 simple_program sp=new simple_program();
	 sp.argu(2,5);

	 System.out.println("Factorial of 5");
 
 for(i=5;i>=1;i--)
 {
	 f=f*i;
 }
 System.out.println(f);
 }

 public int argu(int a, int b)
 {
	 System.out.println("example of argument function");
	 return 5;
 }
 
}
