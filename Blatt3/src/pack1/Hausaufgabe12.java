package pack1;

public class Hausaufgabe12 {

	public static void main(String[] args) {
		//bla
		onlyPrinting();

		//genLineWithIdentedStars
		System.out.println(genLineWithIdentedStars(2,3));

		//pow
		System.out.println(pow(2,10));

	}

	static void onlyPrinting() {
		System.out.println("bla");
	}

	static String genLineWithIdentedStars(int indet, int count) {
		String text = "";
		for(int i = 1 ; i <= indet; i++) {
			text = text + " ";
		}

		for(int i = 1 ; i <= count; i++) {
			text = text + "*";
		}

		return text;
	}

	static int pow(int x, int y) {
		int base = x;
		for(int i = 1; i < y; i++) {
			x = x*base;
		}
		return x;
	}

}
