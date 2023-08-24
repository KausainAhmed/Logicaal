package programs100;

import java.util.Scanner;

public class Fact {
	static int f=1;

	static int fact(int n) {
		if(n<0) {
			System.out.println("Num should be non-neg");
		}else
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to get factorial");
		int x = sc.nextInt();
		System.out.println(fact(x));
	}
}
