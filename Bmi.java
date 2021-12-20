import java.util.*;
public class Bmi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hight in terms of Feet");
		double ht = sc.nextDouble();
		System.out.println("Enter the Weight");
		double kg = sc.nextDouble();
		double m = ht/3.28;
		double bmi = kg / (m*m);
		System.out.println("Higth is = "+ht);
		System.out.println("weight is = "+kg);
		System.out.println("BMI is = "+bmi);
		
		

	}

}
