package mypackage;
import java.util.*;
public class Oddnumbers_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner n=new Scanner (System.in);
		int i =n.nextInt();
		int k=0;
		for(int j=1; j<=i; j++)
		{
			if (j%2!=0)
			{
				System.out.println(j);
				k=k+j;
			}
		}
System.out.println("sum of the odd numbers :" + k);
	}

}
