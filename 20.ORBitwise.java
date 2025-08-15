import java.util.Scanner;
public class ORBitwise {
	public static void main(String[] args) {
		System.out.println("Preforming OR Bitwise Operation...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st Number= ");
		int first = sc.nextInt();
		
		System.out.print("Enter the 2nd Number= ");
		int second = sc.nextInt();
		
		//output is 0 if bits of both operand is 0, otherwise 1
		int result = first | second;
		System.out.print("\nResult is "+result);	
	}
}
