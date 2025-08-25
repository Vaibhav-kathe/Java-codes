import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		System.out.println("Finding LCN of two Number....");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Digit = ");
		int first = sc.nextInt();
		
		System.out.print("Enter the second Digit = ");
		int second = sc.nextInt();
		
		int lcm = lcm(first,second);
		System.out.println("LCM of "+first+" and "+second+" is "+lcm);
		sc.close();
	}
	public static int lcm (int first, int second) {
		for(int i=1; i<=(first*second);i++) {
			if((i%first)==0 && (i%second)==0) {
				return i; //first common multiple found
			}
		}
		return 0; //unreachable
	}
}
