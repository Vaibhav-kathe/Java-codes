public class Parameter {
	public static void main(String[] args) {
		int number0 = sumTwoNum(4,8);
		System.out.println("sum is = "+number0);

		int number1 = sumTwoNum(12,8);
		System.out.println("sum is = "+number1); 
	}
	
	public static int sumTwoNum(int first,int second) {
		System.out.println("First Number is = "+first);
		System.out.println("Second Number is = "+second);
		int sum = first +second;
		return sum;
		}
}
