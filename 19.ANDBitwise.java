import java.util.Scanner;
public class ANDBitwise {
	public static void main(String[] args) {
		System.out.println("Preforming AND Bitwise Operation...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st Number= ");
		int first = sc.nextInt();
		
		System.out.print("Enter the 2nd Number= ");
		int second = sc.nextInt();
		
		//output is 1 if bits of both operand is 1, otherwise 0
		int result = first & second;
		System.out.print("\nResult is "+result);
		sc.close();
	}
}
