import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) {
		System.out.println("Sum of Digits .....");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Digit = ");
		int num = sc.nextInt();
		
		int sum = sumofdigit(num);
		System.out.print("Sum of digits = "+sum);
		sc.close();
	}
	public static int sumofdigit(int num) {
		int sum = 0;
		while(num>0){
			sum =sum+num%10;
			num = num/10;
		}
		return sum;
	}
}
