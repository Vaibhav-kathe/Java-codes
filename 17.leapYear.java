import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Checking Leaf Year....");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year = ");
		int year = sc.nextInt();
		
		if(year%400==0 || ((year%100 !=0) && (year%4 ==0))) {
			System.out.print(year+" is LEAF Year");
		}else {
			System.out.print(year+" is not a LEAF Year");
		}
	}
}
