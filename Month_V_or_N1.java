import java.util.Scanner;
public class Month_V_or_N1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number");
		int i = sc.nextInt();
		if (i>=1 && i<=12)
			System.out.println("valid");
		else 
			System.out.println("not valid");
			
		
	

	}

}
