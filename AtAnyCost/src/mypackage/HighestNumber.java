//Take three numbers from the user and print the greatest number.
package mypackage;
import java.util.Scanner;
public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner (System.in);
		
		int i=0;
		
		for (i=0; i>=3; i++ );
		{
		  System.out.println("Please enter three nunbers");
		  int a = obj.nextInt();
		  int b= obj.nextInt();
		  int c= obj.nextInt();
		
		
		if (a>b & a>c)
		{
			System.out.println("a is grater nunber:" + a);
		}
		else if (b>c)
		{
			System.out.println("b is grater number:" + b);
		}
		
		else 
		{
			System.out.println("C is grater number:" + c);
		}

	}

}

}
