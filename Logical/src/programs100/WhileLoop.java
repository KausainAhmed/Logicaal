package programs100;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		while((n = s.nextInt())!= 0) {
			System.out.println("You entered "+n);
			System.out.println("Input a integer "+s.nextInt());
		}
		System.out.println("Out of Loop");
		
	}
}
