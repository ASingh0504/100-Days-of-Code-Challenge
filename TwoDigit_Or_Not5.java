import java.util.Scanner;
public class TwoDigit_Or_Not5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int i = sc.nextInt();
		if(i>=10 && i<=99 || i<=-10 && i>=-99)
			System.out.println("Number is Two Digit");
		else
			System.out.println("Number is not two Digit");
		

	}

}
