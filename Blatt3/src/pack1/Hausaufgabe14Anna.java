package pack1;

public class Hausaufgabe14Anna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paintStars(5,7);
		System.out.println();
		paintStarBlanksStar(5,7);
		System.out.println();
		filledSquare(5);
		System.out.println();
		hollowSquare(5);
		System.out.println();
		filledTriangle(4);
		System.out.println();
		hollowTriangle(4);
		System.out.println();
		filledRhombos(5);
		System.out.println();
		hollowRhombos(5);
		
	}
	
	static void filledSquare(int g) {
		for (int i =1; i<= g; i++) {
			paintStars(0, g);
			System.out.println();
		}		
	}
	
	
	static void hollowSquare(int g) {
		paintStars(0, g);
		System.out.println();
	
		for (int i =1; i<= g-2; i++) {
		paintStarBlanksStar(0,g-2) ;
		}		
		paintStars(0, g);
	}

	static void filledTriangle(int g) {
		for (int i =1; i<= g; i++) {
			paintStars(g-i, i*2-1);
			System.out.println();
		}		
	}
	
	
	static void hollowTriangle(int g) {
		paintStars(g-1, 1);
		System.out.println();
	
		for (int i =1; i<= g-2; i++) {
		paintStarBlanksStar(g-1-i,i*2-1) ;
		}		
		paintStars(0, g*2-1);
	}

	

	static void filledRhombos (int g) {
		for (int i =1; i<= g; i++) {
			paintStars(g-i, i*2-1);
			System.out.println();
		}		
		for (int i =g-1; i>= 1; i--) {
			paintStars(g-i, i*2-1);
			System.out.println();
		}		
	}
	
	
	static void hollowRhombos(int g) {
		paintStars(g-1, 1);
		System.out.println();
	
		for (int i =1; i<= g-1; i++) {
		paintStarBlanksStar(g-1-i,i*2-1) ;
		}		
		
	
		for (int i =g-2; i>= 1; i--) {
		paintStarBlanksStar(g-1-i,i*2-1) ;
		}		
		paintStars(g-1, 1);
	}

	
	
	
	static void paintStars(int offset, int anz) {
		for (int i = 1; i <= offset; i++) {
			System.out.print("  ");
		}
		for (int i = 1; i<= anz; i++) {
			System.out.print("* ");
			
		}
		
	}
	
	static void paintStarBlanksStar(int offset, int anz) {
		for (int i = 1; i <= offset; i++) {
			System.out.print("  ");
			
		}
		
		System.out.print("*");
		for (int i = 1; i<= anz; i++) {
			System.out.print("  ");
			
		}
		System.out.println(" *");
	}
}
