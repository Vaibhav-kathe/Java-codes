import java.util.*;
public class CheckPosNegZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Check Number\n");
		System.out.print("Enter the Number= ");
		int Number = sc.nextInt();
		
		if(Number>0) {
			System.out.print("Number is positive");
		}else if(Number<0) {
			System.out.print("Number is negative");
		}else if(Number==0) {
			System.out.print("Number is zero");
		}else {
			System.out.print("Invalid Number");
		}
	}
}
