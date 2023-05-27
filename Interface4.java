import java.util.*;
interface Polygon1{
	Scanner sc=new Scanner(System.in);
	void getInput();
}
class Find implements Polygon1{
	double s1,s2,s3;
	public void getInput() {
		System.out.print("Enter Value of Side-1 : ");
		s2=sc.nextDouble();
		System.out.print("Enter Value of Side-2 : ");
		s1=sc.nextDouble();
		System.out.print("Enter Value of Side-3 : ");
		s3=sc.nextDouble();	
	}
	void getPerimeter() {
		getInput();
		double per=(s1+s2+s3);
		System.out.println("Perimeter of Triangle : "+per);
	}
	void getArea() {
		
		double sp=(s1+s2+s3)/2;//SemiPerimeter
		double area = (Math.sqrt((sp * ((sp - s1) * (sp - s2) * (sp - s3)))));
		System.out.println("Area of Triangle : "+area);
	}	
}
public class Interface4 {
	public static void main(String[] args) {
		Find obj=new Find();
		obj.getPerimeter();
		obj.getArea();
	}

}
