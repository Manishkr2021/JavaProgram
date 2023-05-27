import java.util.*;
class H{
	int a=20,b=32;
	void sum() {
		System.out.println("Addition : "+(this.a+this.b));
	}
}
class M extends H{
	int a=20,b=32;
	void sum() {
		super.sum();
		System.out.println("Sum : "+(this.a+this.b));
	}
}
public class InheritanceJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Methods...");
		M obj=new M();
		obj.sum();

	}

}
