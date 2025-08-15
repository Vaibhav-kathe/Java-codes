import java.util.Scanner;
public class XORBitwise {
	public static void main(String[] args) {
		System.out.println("Preforming XOR Bitwise Operation...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st Number= ");
		int first = sc.nextInt();
		
		System.out.print("Enter the 2nd Number= ");
		int second = sc.nextInt();
		
		//output is 0 if bit are 0,0 or 1,1, otherwise 1
		int result = first ^ second;
		System.out.print("\nResult is "+result);	
	}
}
