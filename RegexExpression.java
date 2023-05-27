/*
import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;
public class RegexExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :  ");
		String name=sc.nextLine();
		int count=0;
		Pattern P=Pattern.compile("[0-9]");
		//Pattern P=Pattern.compile("[a-zA-Z]");
		//Pattern P=Pattern.compile(".");
		Matcher M=P.matcher(name);
		while(M.find()) {
			count++;
		}
		//System.out.println("Number of Character : "+count);
		System.out.println("Number of Digits  : "+count);
	}

}

//To Validate Mobile Number;
import java.util.regex.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RegexExpression{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Mobile : ");
		String mob=sc.next();
		Pattern P=Pattern.compile("[6-9][0-9]{9}");
		Matcher M=P.matcher(mob);
		if(M.find()&& M.group().equals(mob)) {
			System.out.println("Given Phone Number is Valid India");
		}
		else {
			System.out.println("Given Phone Number is Not Valid India");
		}
	}
}

*/
//To valid gmail id;
import java.util.*;
import java.util.regex.*;
class RegexExpression{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Gmail ID : ");
		String gmail=sc.next();
		Pattern P=Pattern.compile("[a-z][a-z0-9_]+@gmail[.]com");
		Matcher M=P.matcher(gmail);
		if(M.find() && M.group().equals(gmail)) {
			System.out.print("Valid ");
			
		}
		else {
			System.out.print("Invalid");
		}
	}
}