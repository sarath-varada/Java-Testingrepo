//Write a program in Java to display the cube of the number upto given an integer
package mypackage;
import java.util.*;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner obj=new Scanner (System.in);
       System.out.println("please enter a number");
       int i=obj.nextInt();
       int k=0;
       for(int j=1; j<=i;j++)
       {
    	   k=j*j*j;
    	   System.out.println("Cube of" + k);
       }

	}

}
