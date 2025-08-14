import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Temperature Converter...\n");
		
		System.out.print("\nEnter the temp in Fahrenheit(F)= ");
		int F = sc.nextInt();
	
		int C = (F-32)*5/9;
		System.out.print("Temperature in Celsius = "+C+" C");
	}
}
