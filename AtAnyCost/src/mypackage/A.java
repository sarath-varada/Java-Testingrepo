package mypackage;

public class A 
{
	int x;
	final static int i=10;
	
	public void m1()
	{
		System.out.println(this.i);
	}
	
	public static void main(String[] args) 
	{
		A a= new A();
		System.out.println(A.i);
		
		
		
		

	}

}
