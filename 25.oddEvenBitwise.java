import java.util.Scanner;
public class OddEvenBitwise {
	public static void main(String[] args) {
		System.out.println("Checking Number is odd or even using Bitwise");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number= ");
		int num = sc.nextInt();
		
		if((num&1) == 1) {
			System.out.print("Number is Odd");
		}else {
			System.out.print("Number is Even");
		}
		sc.close();
	}
}
