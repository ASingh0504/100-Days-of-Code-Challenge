import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int p = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		int b = sc.nextInt();
		String sr = (p>=35 && c>=35 && m>=35 && b>=35)? "Pass":"Fail";
		System.out.println("Student is  "+sr);

	}

}
