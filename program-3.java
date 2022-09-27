import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("How long series do you want?");
		System.out.println("Enter the number");
		int a=scan.nextInt();
		
		int x=0;
		int b=1;
		int g=2;
		
	
			if((a%2!=0) ){
				x=a;
			}
			else {
				x=a-1;
			}
			for (int j = 1; j <=x; j++) {
				System.out.print(b);
				b=b+g;
				
			
			
	}

}
}

