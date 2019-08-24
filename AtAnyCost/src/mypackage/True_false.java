//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
package mypackage;
import java.util.*;
public class True_false {
	
	public static void main (String[] args)
	{
		System.out.println("please enter two numbers");
		Scanner obj=new Scanner (System.in);
		System.out.println("first numnber");
		double i=obj.nextDouble();
		System.out.println("second number");
		double j=obj.nextDouble();
		
		if (i>0)
		{
			if(i<1)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	}

}
