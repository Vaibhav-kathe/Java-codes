import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Checking wheather a number is ARMSTRONG is not.....");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		boolean isarmstrong = isArmstrong(num);	
		if(isarmstrong) {
			System.out.println("Your number is Armstrong");
		}
    
  }
	public static boolean isArmstrong(int num) {
		int noOfDigit = numOfDigit(num);
		System.out.println("No. of digit: "+noOfDigit);
		int numCopy = num;
		int finalNumber = 0;
		while(num > 0) {
			int lastDigit = num%10;
			num = num/10;
			finalNumber = finalNumber+pow(lastDigit,noOfDigit);
		}
		return finalNumber == numCopy;
}
