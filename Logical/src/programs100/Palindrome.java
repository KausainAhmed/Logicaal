package programs100;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Palindrome of a String");
		String s = "LOL";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
		System.out.println();
		System.out.println("Reverse of a Number");

		int a = 121;
		int temp = a;

		int revn = 0;
		while (a != 0) {
			int rem = a % 10;
			revn = revn * 10 + rem;
			a = a / 10;
		}

		System.out.println(revn);
		if (revn == temp) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}