
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the length of dictionary");
		
		int n=scan.nextInt();
		int ar[]= new int[n];
		
		System.out.println("Enter the element in the dictonary");
		
		for (int i = 0; i < n; i++) {
			ar[i]=scan.nextInt();
		}
		
		System.out.println("Dictionary is:");
		
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		int count=0;
		
		for (int i = 0; i < n; i++) {
			if(ar[i]%ar[i]==0) {
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}








