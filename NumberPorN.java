import java.util.*;
public class NumberPorN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		String sr = (n>=1)?"Positive":"Negative";
		System.out.println(n+" is a "+sr+" Number");
	

	}

}
