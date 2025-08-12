import java.util.Scanner;
public class FloatNumber {
	public static void main(String[] args) {
		System.out.print("Welcome to Product of Floating Number\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of A = ");
		float A = sc.nextFloat();
		
		System.out.print("Enter the value of B = ");
		float B = sc.nextFloat();
		
		System.out.println("Product is : "+(A*B));
		sc.close();
	}
}
