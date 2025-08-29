import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args){
		System.out.println("Checking weather a number is Palindrome or not....");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();



  }
	public static boolean isPalindrome(int num) {
		int reverse = reverse(num);
		return num == reverse;
	}
}
