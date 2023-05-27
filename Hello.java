//import java.util.*;
//class H{
//	int i;
//	void m() {
//		System.out.println("Value of i : "+i);
//	}
//}
//public class Hello {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		H obj=new H();
//		obj.i=100;	obj.m();
//		obj.i=200;	obj.m();
//		obj.i=300;	obj.m();
//
//	}
//
//}
//class H{
//	{
//		System.out.println("Instance Block");
//	}
//	static {
//		System.out.println("Static block");
//	}
//}
//class Hello{
//	public static void main(String []args) {
//		H obj=new H();
//		H obj1=new H();
//		H obj1=new H();
//		H obj2=new H();
//		H obj3=new H();	
//	}
//}

/*
class H{
	
}
class P{
	
}
class K{
	
}
class M{
	
}
class Hello{
	{
		System.out.println("Hello Helllo class");
	}
	static {
		System.out.println("This is Hello Class Static block");
	}
	public static void main(String[] args) {
		System.out.println("Hello This is Main Method");
		Hello obj=new Hello();
	}
}


final class H{
	void m() {
		
		System.out.println("class H m method");
	}
	
}
class M extends H{
	void m() {
		super.m();
		System.out.println("class M m method");
	}
}
class Hello{
	public static void main(String args[]) {
		M obj=new M();
		obj.m();
		
	}
}


class H{
	int x=20;
}
class M extends H{
	int x=10;
	void sum() {
		System.out.println("Sum : "+(super.x+this.x));
	}
}
class Hello{
	public static void main(String[] args) {
		M obj=new M();
		obj.sum();
	}
}

class H{
	{
		System.out.println("This is Instance block");
	}
	static {
		System.out.println("This is Static Block");
	}
	void H() {
		System.out.println("H method");
	}
	class HI{
		void in() {
			System.out.println("This is class HI in method");
		}
	}
	void K() {
		System.out.println("This is K method");
	}
	
}
class Hello{
	public static void main(String[] args) {
		H obj=new H();
		H obj1=new H();
		obj.H();
		obj.K();
		H.HI inr=obj.new HI();
		inr.in();
	}
}


import java.util.*;
class A{
	final void property() {
		System.out.println("10 Kg Gold + 1 Kg Diamond + 1 Bangla");
	}
}
class B extends A{
	void marry() {
		System.out.println("Manish\n\t Weds\n\t\tAnushka Sharma");
	}
//	void property() {
//		super.property();
//		System.out.println("1 Big Hall");
//	}
	
}
class Hello{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		B obj=new B();
		obj.marry();
		obj.property();
		
	}
}

//Declaration of "final Keyword";
class Hello{
	public static void main(String[] args) {
		final int a;
		a=20;
		System.out.println("Value of A : "+a);
	}
}


//Uses of this and super keyword
import java.util.*;
class H{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
}
class M extends H{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	void sum() {
		int c=super.x+this.x;
		System.out.println("Sum : "+c);
	}
}
class Hello{
	public static void main(String[] args) {
		M obj=new M();
		obj.sum();
	}
}

//Difference b/w length and length();
class Hello{
	public static void main(String[] args) {
		System.out.println("abc".length());
		System.out.println("Manish Kumar".length());
		System.out.println("Ravina Negi".length());
		System.out.println("Jharkhand".length());
		System.out.println("Pala".length());
		System.out.println("abc".length());
		System.out.println("abc".length());
		int a[]= {1,3,4,5,2,9,6};
		System.out.println("Length of Array (a) :  "+a.length);
		int sum=0;
		for(int aa:a) {
			System.out.println(aa);
			sum+=aa;
		}
		System.out.println("Sum  : "+sum);
	}
	
}

class H{
	{
		System.out.println("This is Instance Block");
	}
	static {
		System.out.println("This is Static Block");
	}
	void m() {
		System.out.println("Class H m method");
	}
	static class HH{
		void mm() {
		System.out.println("HH class");
	}
	}
}
class Hello{
	public static void main(String[] args) {
		H obj=new H();
		obj.m();
		//obj.mm();
		H.HH obj1=new H.HH();
		obj1.mm();
	
	}
}


class M{
	void m1() {
		
	}
	void m2() {
		
	}
	void m3() {
		class Calc{
			int add(int a,int b) {
				return a+b;
			}
		}
		Calc c=new Calc();
		System.out.println(c.add(2, 3));
		System.out.println(c.add(20, 30));
		System.out.println(c.add(200, 300));
		System.out.println(c.add(2000, 3000));
		System.out.println(c.add(20000, 30000));
		System.out.println(c.add(200000, 300000));
		System.out.println(c.add(2000000, 3000000));
		System.out.println(c.add(20000000, 30000000));
	}
	void m4() {
		
	}
	void m5() {
		
	}
}
class Hello{
	public static void main(String [] args) {
		M obj=new M();
		obj.m3();
	}
}

//Anonymous Inner class
class H{
	void getBiryani() {
		System.out.println("Chicken Biryani");
	}
}
class Hello{
	public static void main(String[] args) {
		H obj=new H();
		obj.getBiryani();
		obj.getBiryani();
		obj.getBiryani();
		obj.getBiryani();
		obj.getBiryani();
		obj.getBiryani();
		obj.getBiryani();
		obj.getBiryani();
		obj.getBiryani();
		H obj1=new H() {
			void getBiryani() {
				System.out.println("Mutton Biryani");
			}
		};
		obj1.getBiryani();	
	}
}

//Abstraction
abstract class H{
	abstract void m1();
	void m2() {
		System.out.println("m2 from class H");
	}
}
class M extends H{
	public void m1() {
		System.out.println("m1 from class M");
	}
}
class Hello{
	public static void main(String[] args) {
		M obj=new M();
		obj.m1();
		obj.m2();
	}
}

abstract class Computer{
	void compute() {
		System.out.println("I can Compute");
	}
	abstract void doProgramming();
	abstract void videoPlayer();
}
class Desktop extends Computer{
	public void doProgramming() {
		System.out.println("Programming From Desktop");
	}
	public void videoPlayer() {
		System.out.println("Video Playing from Desktop");
	}
}
class Laptop extends Computer{
	public void doProgramming() {
		System.out.println("Programming From Laptop");
	}
	public void videoPlayer() {
		System.out.println("Video Playing from Laptop");
	}
}

class Tab extends Computer{
	public void doProgramming() {
		System.out.println("Programming From Tab");
	}
	public void videoPlayer() {
		System.out.println("Video Playing from Tab");
	}
}
class Hello{
	public static void main(String[] args) {
		Computer obj=new Desktop();
		obj.compute();
		obj.doProgramming();
		obj.videoPlayer();
		
		Computer obj1=new Laptop();
		obj1.compute();
		obj1.doProgramming();
		obj1.videoPlayer();
		
		Computer obj2=new Tab();
		obj2.compute();
		obj2.doProgramming();
		obj2.videoPlayer();
	}
}
*/
interface A{
	void m1();
	void m2();
}
class Demo implements A{
	public void m1() {
		System.out.println("m1 method implemented in Demo class");
	}
	public void m2() {
		System.out.println("m2 method implemented in Demo class");
	}
	
}
class Hello{
	public static void main(String [] args) {
		Demo obj=new Demo();
		obj.m1();
		obj.m2();
	}
}







































