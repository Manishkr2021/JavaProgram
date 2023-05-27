import java.util.*;
interface Language{
	Scanner sc=new Scanner(System.in);
	void getName();	
}
class Concate implements Language{
	String s1,s2;
	public void getName() {
		System.out.print("Enter 1st String : ");
		s1=sc.next();
		System.out.print("Enter 2nd String : ");
		s2=sc.next();	
	}
	void getConcate() {
		getName();
		String s3=s1+" "+s2;
		System.out.println("String Concatanation : "+s3);
	}	
}
public class Interface2 {

	public static void main(String[] args) {
		Concate obj=new Concate();
		obj.getConcate();
	}
}
