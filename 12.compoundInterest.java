package challenges;
import java.util.*;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Compound Interest.....!\n");
		
		System.out.print("Enter the Principle($)= ");
		int P = sc.nextInt();
		
		System.out.print("Enter the Time(Yrs)= ");
		int t = sc.nextInt();
		
		System.out.print("Enter the Rate of Interest(%)= ");
		double R = sc.nextDouble();
		
		double CI = P * Math.pow((1+R/100),t);
		System.out.print("Compund Interest = "+CI+" $");
	}
}
