import java.util.Scanner;
interface Polygon {
    double getArea();
    int getSides();
}

class Rectangle implements Polygon {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public int getSides() {
        return 4;
    }
}

public class Interface3 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Length : ");
    	double l=sc.nextDouble();
    	System.out.print("Enter Breadth : ");
    	double b=sc.nextDouble();
        Rectangle rectangle = new Rectangle(l, b);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Number of sides of rectangle: " + rectangle.getSides());
    }
}