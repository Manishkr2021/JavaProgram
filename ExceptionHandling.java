import java.util.Scanner;

/*
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		int con=1;
		while(con==1) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st Value : ");
		double a=sc.nextDouble();
		System.out.print("Enter 2nd Value : ");
		double b=sc.nextDouble();
		try {
			System.out.print(a/b);
		}
		catch(Exception eobj) {
			System.out.println("Can't divide by zero");
		}
		System.out.print("\nDo you want to continue(1/0)? : ");
		con=sc.nextInt();
		}

	}
}

import java.util.*;
import java.io.*;

class ExceptionHandling{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		try {
			Scanner sc=new Scanner(new File("C:\\Users\\Manish\\eclipse-workspace\\University\\src\\abc.txt"));
			System.out.println("We are reading the content from the file");
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		}
		catch(Exception eobj) {
			System.out.println("File can't be open");
		}
	}
}

import java.util.*;
class ExceptionHandling{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of A : ");
		double a=sc.nextDouble();
		System.out.print("Enter Value fo B : ");
		double b=sc.nextDouble();
		try {
			if(a==b) {
				throw new Exception("I can't add if a==b ");
			}
			else {
				System.out.println("Sum : "+(a+b));
			}
		}
		catch(Exception eobj) {
			//System.out.println(eobj.getMessage());
			eobj.printStackTrace();
		}
	}
}

//Finally block
import java.util.*;
class ExceptionHandling{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of A : ");
		double a=sc.nextDouble();
		System.out.print("Enter Value of B : ");
		double b=sc.nextDouble();
		try {
			if(b==0) {
				throw new Exception("Can't be divide by zero");
			}
			else {
			System.out.println("Div : "+(a/b));
		}
		}
		catch(Exception eobj) {
			System.out.println(eobj.getMessage());
		}
		finally {
			System.out.println("Addition : "+(a+b));
		}
	}
}
*/
import java.util.*;
import java.io.*;
class ExceptionHandling 
{
	public static void main(String[] args) throws Exception
	{
		String data = "Hello Prakash";
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Manish\\eclipse-workspace\\University\\src\\abc.txt");
		byte[] b = data.getBytes();
		fos.write(b);
		fos.close();
	}
}