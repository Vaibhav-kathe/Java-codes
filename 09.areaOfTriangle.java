import java.util.*;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Area of Triangle\n");
		
		System.out.print("Enter the Base(cm) = ");
		double B = sc.nextDouble();

		System.out.print("Enter the Height(cm) = ");
		double H = sc.nextDouble();
		
		double Area = 0.5*B*H;
		System.out.print("Area of Triangle : "+Area+" cm2");
	}
}
