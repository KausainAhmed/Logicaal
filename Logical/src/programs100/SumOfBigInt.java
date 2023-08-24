package programs100;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfBigInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num");
		String b1 = sc.nextLine();

		System.out.println("Enter 2nd num");
		String b2 = sc.nextLine();

		BigInteger n1 = new BigInteger(b1);
		BigInteger n2 = new BigInteger(b2);
		BigInteger sum = n1.add(n2);
		System.out.println("Sum is " + sum);

	}
}
