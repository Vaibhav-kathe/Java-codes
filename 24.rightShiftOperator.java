import java.util.Scanner;
public class RightShiftOperator {
	public static void main(String[] args) {
		System.out.println("Preforming Right Shift Operator...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number= ");
		int num = sc.nextInt();
		
		//filling the new leftmost bit with 0's
		int result = num >> 1;
		System.out.print("\nResult is "+result);
	}
}
