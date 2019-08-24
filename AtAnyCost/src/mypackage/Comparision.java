//Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.
package mypackage;
import java.util.*;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		System.out.println("Please enter 4 numbers");
		for (int i=1; i<=4; i++)
		{
		   int j =obj.nextInt();
		   int k =obj.nextInt();
		   int l=obj.nextInt();
		   int m=obj.nextInt();
		   
		if (j==k & k==l & l==m)
		{
			System.out.println("All are equal");
		}
		
		else
		{
			System.out.println("All are not equal");
		}
		   
		}

	}

}
