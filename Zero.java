import java.util.Scanner;
public class Zero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		String sr = (n==0)?"Zero":"Non-Zero";
		System.out.println(n+"  is  "+sr);
		
	}

}
