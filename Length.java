import java.util.*;
public class Length {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in terms of CM");
		double d = sc.nextInt();
		double inch = d/2.54;
		double feet = inch/12;
		System.out.println(d+" = "+inch+" inch");
		System.out.println(d+" = "+feet+" feet" );

	}

}
