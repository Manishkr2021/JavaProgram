/*
class Trainer{
	int x=10;
}
class Student{
	int x=10;
	void s() {
		System.out.println("Value of X in Student Class : "+x);
	}
	
}
class Employee{
	int x=10;
	int y=20;
	void sum() {
		System.out.println("Sum : "+(x+y));
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello CUK");
		Trainer t=new Trainer();
		System.out.println(t.x);
		Student s=new Student();
		s.s();
		Employee e=new Employee();
		e.sum();
	}

}


import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int con=1;
		while(con==1) {
		System.out.print("Enter Any Charater to find ASCII Value : ");
		char ch=sc.next().charAt(0);
		System.out.printf("ASCII Value of %c is : %d",ch,(int)ch);
		System.out.println("\nDo you want to continue(1/0)? : ");
		con=sc.nextInt();
	}
		
	}
}

//Tongle Character
import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		String newstr="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<97) {
				newstr+=(char)(str.charAt(i)+32);
			}
			else {
				newstr+=(char)(str.charAt(i)-32);	
			}
		}
		System.out.println("New String : "+newstr);
		try {
			
		}
		finally {
			System.out.println("Thanku!!!");
		}
	}
}

*/
