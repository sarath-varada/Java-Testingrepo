package mypackage;
import java.util.*;

public class Naturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner (System.in);
		System.out.println("Please enter a number");
		int i =obj.nextInt();	
		int k =0;
		for (int j=i; j>0; j-- )
		{	
			System.out.println("Natural numbers are : " + j);
			
			k=k+j;
			
		}
		System.out.println(k);
	}
}
