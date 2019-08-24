package mypackage;

public class Starpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
			for (int l=1; l<=5; l++)
			{
				for (int m=4; m>=l; m--)
					{
					System.out.print("*");
			        }
			System.out.println(" ");
		}

	}


}


