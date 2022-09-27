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
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		int a[]= new int[n];
		
		
		

		
		 
		
		while(ar.length-1<=n) {
			
			for (int j = 0; j < a.length; j++) {
				a[j]=ar[j];
			

			
			
			for (int i = 0; i < n; i++) {
				

				
				{
					if(ar[i]%ar[i]==0) {
						count1++;
						
					}
					else if(ar[i]%2==0) {
						count2++;
					}
					else if(ar[i]%3==0) {
						count3++;
					}
					else if(ar[i]%4==0) {
						count4++;
					}
					else if(ar[i]%5==0) {
						count5++;
					}
					else if(ar[i]%6==0) {
						count6++;
					}
					else if(ar[i]%7==0) {
						count7++;
					}
					else if(ar[i]%8==0) {
						count8++;
					}
					else if(ar[i]%9==0) {
						count9++;
					}
				}
				
			}
		}
		System.out.print("1:"+count1+" 2:"+count2+" 3:"+count3+" 4:"+count4+" 5:"+count5+" 6:" +count6+" 7:"+count7+" 8:"+count8+" 9:"+count9);
	}}

}








