import java.util.*;
public class StringMethods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String to Convert Lower Case : ");
		String str=sc.nextLine();
		System.out.println("Lower Case : "+str.toLowerCase());
		System.out.print("Enter String to Convert Upper Case : ");
		str=sc.nextLine();
		System.out.println("Upper Case : "+str.toUpperCase());
		System.out.print("Enter String to To Replace 'A' to 'Q' : ");
		str=sc.nextLine();
		System.out.println("To Replace 'A' to 'Q': " + str.replace('A', 'Q'));
		System.out.print("Enter String to To trim() : ");
		str = sc.nextLine();
		System.out.println("Trim : " + str.trim());
		System.out.print("Enter 1st String : ");
		String str1=sc.nextLine();
		System.out.print("Enter 2nd String  to check equals or not : ");
		String str2=sc.nextLine();
		System.out.println("To check equals : "+str1.equals(str2));
	}

}
