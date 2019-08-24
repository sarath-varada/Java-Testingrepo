package mypackage;

import java.util.Scanner;

public class Triangle_pattern_with_increased_by_1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Number of rows");
		Scanner n=new Scanner (System.in);
		int a =n.nextInt();
		int k=1;
		
		for (int i=1; i<=a;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print(k++);
				
			}
			System.out.println(" ");
			
		}
	}
}

	



