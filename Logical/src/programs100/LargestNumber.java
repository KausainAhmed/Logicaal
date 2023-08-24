package programs100;

import java.util.*;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = s.nextInt();

		System.out.println("Enter number 2");
		int b = s.nextInt();

		System.out.println("Enter number 3");
		int c = s.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is larger");
		} else if (b > a && b > c) {
			System.out.println(b + " is larger");
		} else if (c > a && c > b) {
			System.out.println(c + " is larger");
		} else {
			System.out.println("Same mat dal chutiye");
		}
	}
}
