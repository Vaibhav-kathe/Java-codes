package Pattern;
import java.util.*;
public class InvertHalfPyr180
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)    //rows
		{
			for(int j=1 ; j<=n-i ;j++)  //spaces
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ;j++)     //stars
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
