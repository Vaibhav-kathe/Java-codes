import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args){
		System.out.println("Checking weather a number is Palindrome or not....");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		if(ispalindrome) {
			System.out.println("Your Number is Palindrome");
		}else {
			System.out.println("Your Number is not Palindrome");
		}



 	}
	public static boolean isPalindrome(int num) {
		int reverse = reverse(num);
		return num == reverse;
	}
	public static int reverse(int num) {
		int newNum = 0;
		while(num>0) {
			int digit = num%10;
			newNum = newNum*10 + digit;
			num/=10;
		}
		return newNum;
}
