import java.util.*;
public class PerimeterRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Perimeter of Rectangle\n");
		System.out.print("Enter all 4 slide(cm) = ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int Perimeter = A+B+C+D;
		System.out.println("Perimeter of Rectangle is  : "+Perimeter+" cm ");
		sc.close();
	}
}
