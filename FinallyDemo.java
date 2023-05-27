import java.util.*;
public class FinallyDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int con=1;
		while(con==1) {
		System.out.print("\n\t----------DIVISION CALCULATOR----------------\n");
		System.out.print("Enter 1st Value : ");
		double a=sc.nextDouble();
		System.out.print("Enter 2nd Value : ");
		double b=sc.nextDouble();
			try {
				if(b==0) {
					throw new Exception("Can't be divide by Zero");
				}
				else {
					System.out.println("Div : "+(a/b));
				}
			}
			catch(Exception eobj) {
				System.out.println(eobj.getMessage());
			}
			finally {
				System.out.println("This is Finally block,It'll Excecute Every time \n\t\tThanku!!! ");
			}	
			System.out.print("\nDo you want to continue(1/0)? : ");
			con=sc.nextInt();
	}
	}
}
