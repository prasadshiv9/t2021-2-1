
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("How long series do you want?");
		System.out.println("Enter the number");
		int a=scan.nextInt();
		
		int b=1;
		int x=2;
		for (int i = 1; i <=a; i++) {
			System.out.print(b+" ");
			b=x+b;
			
		}
	}

}

