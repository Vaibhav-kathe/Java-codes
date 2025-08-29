import java.util.Scanner;
public class OneD_Array {
	public static void main(String[] args) {
		System.out.println("Searching Number in 1D Array by traversal....");
		int[] arr = {3,6,8,87,65,4,68,23,9,98,34};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number that u want search = ");
		int num = sc.nextInt();
		boolean isfound = isFound(arr,num);
		if(isfound) {
			System.out.println("Your Number is found in array");
		}else {
			System.out.println("Your Number is not found in array");
		}
		sc.close();
	}
	public static boolean isFound(int[]arr,int num) {
		int i =0;
		while (i < arr.length) {
			if(arr[i]==num) {
				return true;
			}
			i++;
		}
		return false;
	}
}
