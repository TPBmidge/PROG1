package pack1;

public class Hausaufgabe14 {

	public static void main(String[] args) {
		//printFilledSquare(6);
		//printHollowSquare(6);
		//printFilledTriangle(5);
	printHollowTriangle(5);
		//printFilledRhombus(5);
		//printHollowRhombus(5);

	}

	static void printHollowRhombus(int size){
		int mid = size-1;


		//TopTip
		paintStars(mid,1);
		System.out.println();

		//TopTriangle
		for(int i = 1; i <= size-2; i++) {
			paintStarBlanksStar(mid-i, i*2-1);
			System.out.println();
		}

		// BottomTriangle
		for (int i = size - 3; i >= 1; i--) {
			paintStarBlanksStar(mid - i, i * 2 - 1);
			System.out.println();
		}



		//BottomTip
		paintStars(mid,1);
		System.out.println();
	}

	static void printFilledRhombus(int size){
		int mid = size-1;

		//TopTip
		paintStars(mid,1);
		System.out.println();

		//TopTriangle
		for(int i = 1; i <= size-2; i++) {
			paintStars(mid-i, i*2+1);
			System.out.println();
		}

		//BottomTriangle
		for(int i = size-3; i >= 1; i--) {
			paintStars(mid-i, i*2+1);
			System.out.println();
		}


		//BottomTip
		paintStars(mid,1);
		System.out.println();
	}


	static void printFilledTriangle(int size){
		int base = 2*size-1;
		int mid = size-1;


		//Top
		paintStars(mid,1);
		System.out.println();


		for(int i = 1; i <= size-2; i++) {
			paintStars(mid-i, i*2+1);
			System.out.println();
		}


		//Bottom
		for(int i = 1; i <= base; i++) {
			System.out.print("* ");
		}
	}

	static void printHollowTriangle(int size){
		int base = 2*size-1;
		int mid = size-1;


		//Top
		paintStars(mid,1);
		System.out.println();


		for(int i = 1; i <= size-2; i++) {
			paintStarBlanksStar(mid-i, i*2-1);
			System.out.println();
		}


		//Bottom
		for(int i = 1; i <= base; i++) {
			System.out.print("* ");
		}
	}


	static void printFilledSquare(int size) {
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void printHollowSquare(int size) {
		//Top
		for(int j = 1; j <= size; j++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i = 1; i <= size-2; i++) {
				System.out.print("* ");
				paintStars(size-2, 1);
			System.out.println();
		}
		//Bottom
		for(int j = 1; j <= size; j++) {
			System.out.print("* ");
		}
	}


	static void paintStars(int offset, int anz) {
		for(int i = 1; i <= offset; i++) {
			System.out.print("  ");
		}
		for(int i = 1; i <= anz; i++) {
			System.out.print("* ");
		}

	}

	static void paintStarBlanksStar(int offset, int anz) {
		for(int i = 1; i <= offset; i++) {
			System.out.print("  ");
		}
		System.out.print("* ");
		for(int i = 1; i <= anz; i++) {
			System.out.print("  ");
		}
		System.out.print("*");
	}

}
