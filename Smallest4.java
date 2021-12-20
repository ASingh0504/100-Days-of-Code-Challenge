import java.util.*;
public class Smallest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Four Integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a<b && a<c && a<d)
			System.out.println(a+"  is Smallest ");
		else if(b<c && b<d)
			System.out.println(b+"  is Smallest ");
		else if(c<d)
			System.out.println(c+"  is Smallest ");
		else
			System.out.println(d+"  is Smallest ");

	}

}
