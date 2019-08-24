// Write a Java program to get a number from the user and print whether it is positive or negative
package mypackage;
import java.util.Scanner;

public class FirstJavaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter any number");
		
		int a = obj.nextInt();
		if (a>0)
		{
			System.out.println("The given number is possitive");
		}
		else
		{
			System.out.println("The given number is negative");
		}
		

	}

}
