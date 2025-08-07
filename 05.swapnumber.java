import java.util.Scanner;
public class input {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Swapping of Two Number");
		
		System.out.print("Enter the Value of a = ");
		int a = sc.nextInt();
		System.out.print("Enter the Value of b = ");
		int b = sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		sc.close(); 
	}
}
