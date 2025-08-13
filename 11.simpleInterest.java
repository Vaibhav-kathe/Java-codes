import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Simple Interest.....!\n");
		
		System.out.print("Enter the Principle($)= ");
		int P = sc.nextInt();
		
		System.out.print("Enter the Time(Yrs)= ");
		int T = sc.nextInt();
		
		System.out.print("Enter the Rate of Interest(%)= ");
		double R = sc.nextDouble();
		
		double SI = (P*T*R)/100;
		System.out.print("Simple Interest = "+SI+" $ ");
	}
}
