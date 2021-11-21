package pack1;

public class Hausaufgabe13 {
	public static void main(String[] args) {
		calcAndPrint(1, 3);
		calcAndPrint(1, 2);
		calcAndPrint(2, 0);
	}


	public static void calcAndPrint(int a, int b) {
		System.out.println(a + " + " + b + " = " + sum(a,b));
		System.out.println(a + " - " + b + " = " + diff(a,b));
		System.out.println(a + " x " + b + " = " + multi(a,b));
		System.out.println(a + " / " + b + " = " + div(a,b));
	}

	public static int sum(int a, int b) {
		return a+b;
	}

	public static int diff(int a, int b) {
		return a+b;
	}

	public static int multi(int a, int b) {
		return a*b;
	}

	public static int div(int a, int b) {
		if(b == 0) {
			return 9999999;
		}else {
			return a/b;
		}

	}


}


