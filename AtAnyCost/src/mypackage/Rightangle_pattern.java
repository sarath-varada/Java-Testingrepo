package mypackage;
import java.util.*;
public class Rightangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of rows");
		Scanner n=new Scanner (System.in);
		int a =n.nextInt();
		
		for (int i=1; i<=a;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

}
