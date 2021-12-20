import java.util.Scanner;
public class BiggestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int k = sc.nextInt();
		int j = sc.nextInt();
		int rs = (n>k && n>j)? n:(k>j)? k:j;
		System.out.println(rs+" is Biggest Number");

	}

}

