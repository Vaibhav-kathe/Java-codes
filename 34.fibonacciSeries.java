import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Fibonacci Series ...");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  certain Number = ");
		int num = sc.nextInt();
		printfibonacci(num);
		sc.close();
	}
	public static void printfibonacci(int num) {
		if(num<=0) {
			System.out.println("0");
			return;
		}
		int first = 0;
		int second = 1;
		while(first+second <= num) {
			  int third = first+second;
			  System.out.print(third +" ");
			  first = second;
			  second = third;
		}	
	}
}
