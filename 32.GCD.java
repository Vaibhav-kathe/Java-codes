import java.util.Scanner;
public class GCD {
	public static void main(String[] args) {
		System.out.println("Finding LCN of two Number....");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Digit = ");
		int first = sc.nextInt();
		
		System.out.print("Enter the second Digit = ");
		int second = sc.nextInt();
		
		int gcd = gcd(first,second);
		System.out.println("GCD of "+first+" and "+second+" is "+gcd);
		
	}
	public static int gcd(int num1,int num2) {
		int gcd = 1;
		int i = 2;
		
		int least = least(num1, num2);
		while(i <= least) {
			if(num1%i==0 && num2%1==0) {
				gcd = i;
			}
			i++;
		}
		return gcd;	
	}
	public static int least(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}

}
