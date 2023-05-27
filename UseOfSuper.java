import java.util.*;
class T{
	void m() {
		System.out.println("m method from Class T");
	}
}
class D extends T{
	void m() {
		super.m();//Super Keyword is used to call super class,method,variable
		System.out.println("m method from Class D");
	}
	
}
public class UseOfSuper {

	public static void main(String[] args) {
		D obj=new D();
		obj.m();

	}

}
