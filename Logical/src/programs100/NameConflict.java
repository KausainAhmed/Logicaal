package programs100;

import java.util.Scanner;

public class NameConflict {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name here");
		while (s.hasNextInt() || s.hasNextDouble()) {
			System.out.println("Name bola tha number nahi ");
			s.nextLine();
		}
		System.out.println("Welcome " + s.nextLine());
	}
}
