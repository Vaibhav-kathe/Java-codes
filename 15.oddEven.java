import java.util.*;
public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Check Number\n");
		System.out.print("Enter the Number = ");
		int Number = sc.nextInt();
		
		if(Number%2==0) {
			System.out.print("Number is EVEN");
		}else{
			System.out.print("Number is ODD");
		}
		sc.close();
	}
}
