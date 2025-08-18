import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Factorial of Number...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int N = sc.nextInt();
		long factorial=1;
		if(N<2) {
			System.out.println("1"); 
		}
		for(int i=N;i>=1;i--) {
			factorial = factorial * i;
			System.out.print(i+" x ");
		}
		System.out.println("\nFactorial is = "+factorial);
		sc.close();
	}
}
