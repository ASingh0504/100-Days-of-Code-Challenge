import java.util.*;
public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Intger Number");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	

	}

}
