package programs100;

import java.util.Scanner;

public class EvenOdd {
	static void check(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else
			System.out.println(n + " is odd");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even-odd");
		int n = sc.nextInt();
		check(n);
	}
}
