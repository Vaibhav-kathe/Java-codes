package challenges;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		System.out.println("Calculate Grade based on marks");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks(0-100)= ");
		int marks = sc.nextInt();
		
		if(marks<=100 && marks>=90) {
			System.out.print("Grade = A");
		}else if(marks<90 && marks>=75) {
			System.out.print("Grade = B");
		}else if(marks<75 && marks>=60) {
			System.out.print("Grade = C");
		}else if(marks<60 && marks>=30) {
			System.out.print("Grade = D");
		}else if(marks<30) {
			System.out.print("Grade = F");
		}else{
			System.out.print("Invalid Marks");
		}
	}
}
