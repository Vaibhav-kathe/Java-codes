package challenges;
import java.util.*;

public class ArithmeticOperator {
	public static void main(String[]args) {
		System.out.print("Welcome to Arithmetic Operation\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of A = ");
		int A = sc.nextInt();
		
		System.out.print("Enter the value of B = ");
		int B = sc.nextInt();
		
		System.out.println("\nAddition of "+A+" and "+B+" = "+ (A+B));
		System.out.println("Subtraction of "+A+" and "+B+" = "+ (A-B));
		System.out.println("Multiplication of "+A+" and "+B+" = "+ (A*B));
		System.out.println("Division of "+A+" and "+B+" = "+ (A/B));
		System.out.println("Reminder of "+A+" and "+B+" = "+ (A%B));	
	}
}
