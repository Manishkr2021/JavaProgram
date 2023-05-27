import java.util.*;

public class AllFunction {
	public static void Sum() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of A : ");
		double a=sc.nextDouble();
		System.out.print("Enter Value of B : ");
		double b=sc.nextDouble();
		double c=a+b;
		System.out.println("Sum : "+c);
	}
	public static double Multi() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of A : ");
		double a=sc.nextDouble();
		System.out.print("Enter Value of B : ");
		double b=sc.nextDouble();
		double c=a*b;
		return c;
	}
	public static void Div(double a,double b) {
		try {
			if(b==0) {
				System.out.println("Can't divide by zero");
				System.exit(0);
			}
			double result=a/b;
			System.out.println("Div : "+result);
		}
		catch (Exception e) {
			
		}
	
	}
	
	public static double Rem(double a,double b) {
		double result=0.0;
		try {
			if(b==0) {
				System.out.println("Can't divide by zero");
				System.exit(0);
			}
			result=a%b;
		}
		catch (Exception e) {
			
		}
		return  result;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//No argument no return type
		//Sum();
		//No argument with return type
//		double result=Multi();
//		System.out.println("Multiplication : "+result);
		//With Argument No return type
//		System.out.print("Enter Value of A : ");
//		double a=sc.nextDouble();
//		System.out.print("Enter Value of B : ");
//		double b=sc.nextDouble();
//		Div(a,b);
		//With Argument With Return Type
		System.out.print("Enter Value of A : ");
		double a=sc.nextDouble();
		System.out.print("Enter Value of B : ");
		double b=sc.nextDouble();
		double result=Rem(a,b);
		System.out.println("Remainder : "+result);

	}

}
