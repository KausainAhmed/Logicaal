package programs100;

public class WrapperClass {
	public static void main(String[] args) {
		int a = 10;
		Integer z = 5;

		String s1 = "24";
		Integer b = Integer.valueOf(a);
		Integer c = a;

		int d = z;
		int e = Integer.valueOf(z);
		
		Long l1 = Long.valueOf(a);
		Double d1 = Double.valueOf(s1);
		
		System.out.println("e=" + e);
		System.out.println("d=" + d);
		System.out.println("c=" + c);
		System.out.println("b=" + d1);

		int i1=Integer.parseInt(s1);//String to int
		String s2=Integer.toString(a);//int to String
		
	}
}
