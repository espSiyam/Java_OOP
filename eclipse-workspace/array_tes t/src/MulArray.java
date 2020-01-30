
public class MulArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = new int [3][];
		arr1[0] = new int [3];
		arr1[1] = new int [2];
		arr1[2] = new int [3];
		
		int arr[][] = {{1,2,3},{2,4},{4,5,7}};
		
		int i;
		int j;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
