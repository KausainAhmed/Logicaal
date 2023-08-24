package programs100;

import java.util.Scanner;

public class Swapping {
//using third variable

	public static void main(String[] args) {
		int temp = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first value");
		int a = s.nextInt();
		System.out.println("Enter second value");
		int b = s.nextInt();
		System.out.println("Before swapping a= " + a + " " + "b= " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping a= " + a + " " + "b= " + b);
	}
}

class Swapping2 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter first value");
		int x = s1.nextInt();
		System.out.println("Enter second value");
		int y = s1.nextInt();
		System.out.println("Before swapping x= " + x + " " + "y= " + y);
		// without using 3rd variable
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Before swapping x= " + x + " " + "y= " + y);

	}
}




class Demo{
	public static void main(String[] args) {
		int x=3,y=6,temp;
		System.out.println("x=3, y=6");
		temp=x;
		x=y;
		y=temp;
		System.out.println(x+" "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
	}
}
