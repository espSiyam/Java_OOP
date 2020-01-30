import java.util.*;

public class ArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[] = new int [3];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		for(i=0;i<3;i++) {
			System.out.println(a[i]+"\t");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		
		int num [] = {2,3,5,6,8,6,3};
		for(i=0;i<7;i++) {
			System.out.println(num[i]+"\t");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		Arrays.sort(num);
		for(i=0;i<7;i++) {
			System.out.println(num[i]+"\t");
		}

	}

}
