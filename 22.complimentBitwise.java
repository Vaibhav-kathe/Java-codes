import java.util.Scanner;
public class ComplimentBitwise {
	public static void main(String[] args) {
		System.out.println("Preforming Compliment Bitwise Operation...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number= ");
		int num = sc.nextInt();
		
		//if input is 1 then output is 0 or visaversa 
		int result = ~num;
		System.out.print("\nResult is "+result);
		sc.close();
	}
}
