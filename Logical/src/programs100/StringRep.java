package programs100;

public class StringRep {
	public static void main(String[] args) {
		String s1 = "Kausain";
		String s2 = "Ahmed";

		String x1 = s1.replace("Kausain", "Ahmed");
		String x2 = s2.replace("Ahmed", "Kausain");

		System.out.println(x1 + " " + x2);

		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("s1= " + s1 + "   s2= " + s2 + " ");

		
		String a="hello";
		String b="world";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println(a+"= a");
		System.out.println(b+"= b");
		
	}
}
