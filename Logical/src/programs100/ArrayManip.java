package programs100; 

import java.util.HashSet;
import java.util.Set;

public class ArrayManip {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 5, 7, 8 };
		int[] arr2 = { 2, 4, 6, 8, 9 };

		printx(arr1, arr2);
	}

	static void printx(int arr1[], int arr2[]) {
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			s.add(arr2[i]);
			/*
			 * if (s.contains(arr2[i])) { System.out.print(arr2[i]); }
			 */
			// System.out.print(arr2[i]);
		}
		System.out.print(s);
	}
	/*
	 * Set s=new HashSet<>(); 
	 * static void remDup(int arr1[],int arr2[]) {
	 *  for (int i = 0; i < arr2.length; i++) {
	 *   s.add(arr2[i]); }
	 */
}
