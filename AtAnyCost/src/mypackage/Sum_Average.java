package mypackage;
import java.util.*;
public class Sum_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter any 5 numbers");
		
		int k=0;
		int l=0;
		for(int j=0; j<5;j++)
		{
			int i=obj.nextInt();
			
			k=k+i;
			l =k;
			l= l/5;
		}
System.out.println("sum of 5 numbers:" + k);
System.out.println("Average of 5 numbers:" + l);
	}

}
