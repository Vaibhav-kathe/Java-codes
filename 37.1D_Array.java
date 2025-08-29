public class TwoD_Array {
  public static void main(String[] args) {
		//1st method
		//int[][] arr = new int[2][3]; 
		//arr[0][0]=9;
		
		//2nd method
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int i=0;
		while(i<arr.length) {
			int j = 0;
			while(j <arr[i].length) {
				System.out.print(arr[i][j]+ " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
