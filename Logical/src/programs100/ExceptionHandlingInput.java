package programs100;
 
import java.util.Scanner;

public class ExceptionHandlingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1");

		while (!sc.hasNextInt()) {
			System.out.println("Please input number only");
			sc.next();
		}
		int d1 = sc.nextInt();
		System.out.println("Enter value 2");
		while (!sc.hasNextInt()) {
			System.out.println("Please input number only");
			sc.next();
		}
		int d2 = sc.nextInt();
		int res = d1 + d2;
		System.out.println("Result " + res);

	}
}
