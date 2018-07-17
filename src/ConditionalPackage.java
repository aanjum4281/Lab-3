import java.util.Scanner;

public class ConditionalPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in); 
		int x; 
		
		System.out.println("What is your name?");
		String name = scnr.next();
		
		System.out.println("Enter a value" );
		x = scnr.nextInt();
		
		if (x % 2 == 1 && x < 60)
			System.out.println("Hi " + name + ", " + x + " is odd.");
		
		else if (x % 2 == 0 && x > 2 && x < 25)
			System.out.println("Hi " + name + ", the integer is even and less than 25.");
		
		else if (x % 2 == 0 && x > 26 && x < 60)
			System.out.println("Hi " + name + " the integer is even.");
		
		else if (x % 2 == 0 && x >= 60)
			System.out.println("Hi " + name + ", " + x + " is even.");
		
		else if (x % 2 == 1 && x > 60)
			System.out.println("Hi " + name + ", " + x + " is odd and over 60.");
		
		scnr.close();
	}

}
