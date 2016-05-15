import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a,b and c:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		double sum = (b*b-4*a*c);
		double root1 = (-b+sum) / (2*a);
		double root2 = (-b - sum) / (2*a);
		System.out.println("The roots are " +root1+ " and " + root2);
	
		
	}

	}

