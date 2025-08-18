import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		System.out.println("Multiplication table...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int N = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int table = N * i ;
			System.out.println(N+" x "+i+" = "+table);
		}
	}
}
