import java.util.*;
public class SimpleIntrest {

	public static void main(String[] args) {
		System.out.println("Enter the Principal Amount");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Enter the rate of Intrest");
		double r = sc.nextDouble();
		System.out.println("Enter the Time ");
		double t = sc.nextDouble();	
		double si = a*r*t/100;
		System.out.println("Amount is"+": "+a);
		System.out.println("Rate Of Intrest is"+": "+r);
		System.out.println("Time Period is"+": "+t);
		System.out.println("Simple Intrest is"+": "+si);
				
		
		

	}

}
