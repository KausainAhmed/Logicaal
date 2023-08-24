package programs100;

public class StarPattern {
	public static void main(String[] args) {
		int row, numOfStar;

		for (row = 1; row <= 5; row++) {
			for (numOfStar = 1; numOfStar <= row; numOfStar++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
