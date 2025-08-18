import java.util.Scanner;
public class SumOFOdd {
	public static void main(String[] args) {
		System.out.println("Summission of all Odd Number");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number from 1 to N = ");
		int N = sc.nextInt();
		
		int sum=0;
		for(int i=0;i<=N;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\nSum from 1 to "+N+" = "+ sum);
	}
}
