/*
import java.util.*;
interface Interest{
	Scanner sc=new Scanner(System.in);
	void getInput();
}
class Calculate implements Interest{
	double p,r,t,in;
	public void getInput() {
		System.out.print("Enter Principle : ");
		p=sc.nextDouble();
		System.out.print("Enter Rate : ");
		r=sc.nextDouble();
		System.out.print("Enter Time : ");
		t=sc.nextDouble();
	}
	void getInterest() {
		getInput();
		in=(p*r*t)/100;
		System.out.println("Simple Interest : "+in);
	}
}
public class InterfaceSimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculate obj=new Calculate();
		obj.getInterest();
	}

}
*/