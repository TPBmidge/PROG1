package pack1;

public class Hausaufgabe13Anna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcAndPrint(8,3);
	}

	public static void calcAndPrint(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		if (b==0) {
			System.out.print("999999");
		} 
		else 
		System.out.println(a/b);
	
		
	}
}
