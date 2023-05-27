import java.util.*;
public class NestedTry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int con=1;
		while(con==1) {
		try {	//Outer try block
		System.out.print("Enter Length of Array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter "+i+" Value : ");
			a[i]=sc.nextInt();		
		}
		System.out.print("Array Elements : \n");
		System.out.print("Enter Index to be Print Element : ");
		int x=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			try {	//Inner try block
				if(x<0) {
					throw new Exception("NegativeArrayIndexBoundException");
				}
				else if(x>=n) {
					throw new Exception("ArrayIndexOutOfBoundException");
				}
				else {
					System.out.println("Element present at "+x+" th Index is : "+a[x]);
					break;
				}
				
			}
			catch(Exception eobj) {		//Inner catch Block
				System.out.println(eobj.getMessage());
				break;
			}
		}

	}
		catch(Exception eobj) {		//Outer catch Block
			System.out.println("An error Occurred");	
		}
		System.out.print("\nDo you want to continue(1/0)? : ");
		con=sc.nextInt();
		}
	}

}
