package First_program;

public class java_operators implements FirstInterface{
	public static void main(String[] args) {
		int a=89;
		int y=++a;  //pre-increment operator
		System.out.println(y);
		
		int z=56;
		int r = z--; //post-decrement operator
		
		System.out.println(r);
		
		int s=23;
		int d= --s;   //pre decrement operator
		System.out.println(d);
		
		
	}

	@Override
	public void absmethod() {
		// TODO Auto-generated method stub
		
	}

}
