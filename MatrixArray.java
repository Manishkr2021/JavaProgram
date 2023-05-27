import java.util.*;
public class MatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int r=sc.nextInt();
		System.out.print("Enter Number of Columns : ");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix : \n");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
