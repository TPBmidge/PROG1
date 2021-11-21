package pack1;

public class SpMod4Methodes {

	public static void main(String[] args) {
		doIt(12);
	}

	static void printP(int m, int perM) {
		int h = calc(m, perM);
		System.out.println(h);
	}

	static int calc(int m, int pM) {
		return m * pM;
	}

	static void printLine() {
		int i = 0, h = 0;
		for (i = 0; i < 2; i++) {
			System.out.print("--_");
			h = i;
		}

		System.out.println(" ( i , h ) = ( " + i + " , " + h + " ) ");
	}

	static void doIt(int v) {
		printP(v, 3);
		printLine();
		printP(calc(2, v), calc(4, 1));
	}

}
