// Normal Method 
import java.util.Scanner;
public class GreatestOfThree {
	public static void main(String[] args) {
		System.out.println("Calculating Greatest Number...");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number = ");
		int first = sc.nextInt();
		
		System.out.print("Enter the second number = ");
		int second = sc.nextInt();
		
		System.out.print("Enter the third number = ");
		int third = sc.nextInt();
		
		if(first >= second && first >= third) {
			System.out.println(first+" is greatest number");
		}else if(second >= first && second >= third) {
			System.out.println(second+" is greatest number");
		}else if(third >= first && third >= second){
			System.out.println(third+" is greatest number");
		}else {
			System.out.println("Invaid");
		}
	}
}
