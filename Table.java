import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int con=1;
		while(con==1) {
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		System.out.print("\nDo you want to continue(1/0)? : ");
		con=sc.nextInt();
		}

	}

}
