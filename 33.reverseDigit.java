import java.util.Scanner;
public class ReverseDigit {
	public static void main(String []args) {
		System.out.println("Reversering the Digit...");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		int reverse = reverse(num);
		System.out.println("Reversed of your number is : "+reverse);
		sc.close();
	}
	public static int reverse(int num) {
		int newNum = 0;
		while(num>0) {
			int digit = num % 10;
			newNum = newNum * 10 + digit;
			num =num/10;
		}
		return newNum;

	}
}
