package programs100;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 1");
		while (!sc.hasNextInt()) {
			System.out.println("plz input only a num");
			sc.next();
		}
		int i = sc.nextInt();

		System.out.println("input 2");
		while (!sc.hasNextInt()) {
			System.out.println("plz input only a num");
			sc.next();
		}
		int j = sc.nextInt();
		int res = i + j;
		System.out.println(res);
	}
}
