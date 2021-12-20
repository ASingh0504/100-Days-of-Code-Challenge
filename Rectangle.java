import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		System.out.println("Enter the Lenght of Rectangle");
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		System.out.println("Enter the Width of Rectangle");	
		double w = sc.nextDouble();
		double ar = l*w;
		double per = 2*l+2*w;
		System.out.println("Length of Rectangle is"+": "+l);
		System.out.println("Width of Rectangle is"+": "+w);
		System.out.println("Area of Rectangle is"+": "+ar);
		System.out.println("Perimeter of Rectangle is"+": "+per );

	}

}
