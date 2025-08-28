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
		}else {
			System.out.println("Your number is not Armstrong");
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
	public static int pow(int num1,int num2) {
		int result = 1;
		int i=0;
		while(i<num2) {
			result = result*num1;
			i++;
		}
		System.out.println("Power of "+num1+" is : "+result );
		return result;
	}
