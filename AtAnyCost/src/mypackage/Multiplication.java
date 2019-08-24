package mypackage;
import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj= new Scanner(System.in);
		System.out.println("Enter any number to display the multiplication table upto 10");
		int n = obj.nextInt();
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(n + "x" + i + "=" + (n*i));
		}
		
	}

}
