import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a;
		double b;
		double result = 0;
		
		System.out.println("Enter first number");
		a=scan.nextDouble();
		
		System.out.println("Enter second number");
		b=scan.nextDouble();
		
		System.out.println("Enter an operator: +, -, *, /");
		String operator =scan.next();
		
		switch(operator) {
		case "+": result=a+b;
		break;
		
		case "-": result=a-b;
		
		  break;
		  
		case "*": result=a*b;
		  break;
		  
		case "/": result=a/b;
		default: System.out.println("Wrong operator");
		 break;
			
		}
		
		System.out.println(a+" "+operator+" "+b+" "+" : "+result);
		
	}

}

