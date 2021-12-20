import java.util.Scanner;
public class MiddleValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int rs = (a>b && a<c || a>c && a<b) ? a:(b>a && b<c || b>c && b<a)? b:c;
		System.out.println(rs+" is Middle Number");

	}

}

