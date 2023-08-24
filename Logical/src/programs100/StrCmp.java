package programs100;

import java.util.Scanner;

//Comparing two strings using compareTo 
public class StrCmp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1 = s.nextLine();
		System.out.println("Enter 2nd string");
		String s2 = s.nextLine();

		if (s1.compareTo(s2) > 0)
			System.out.println("1st string is greater");
		else if (s1.compareTo(s2) < 0) {
			System.out.println("2nd string is greater");
		} else if (s1.compareTo(s2) == 0)
			System.out.println("Both strings are equal");
		// s1>s2 == 1
		// s1<s2 == -1
		// s1==s2 == 0
		// comparison is done based on their ASCII values
	}
}
