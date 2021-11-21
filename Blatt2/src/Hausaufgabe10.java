import javax.swing.JOptionPane;

public class Hausaufgabe10 {

	public static void main(String[] args) {
		int g = Integer.parseInt(JOptionPane.showInputDialog("Größe:"));
		
		Raute2(g);
		Quadrat(g);
		Dreieck(g);
		Raute(g);
		Quadrat2(g);
		Dreieck2(g);

	}
	
	
	private static void Quadrat2(int g) {
		
		//Erste Zeile
		for(int i = 1; i <= g; i++) {
			System.out.print("* ");
		}
		
		//Zwischenzeilen
		for(int i = 1; i <= g-2;i++) {
			System.out.println();
			for(int j = 1; j <= g-1; j++) {
				
				
				if(j==1) {
					System.out.print("* ");
				}
				if(j==g-1) {
					System.out.print("*");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
		}
		
		
		//Letze Zeile
		System.out.println();
		for(int i = 1; i <= g; i++) {
			System.out.print("* ");
		}
		
		
		
	}
	
	
	private static void Dreieck2(int g) {
		
		
		//Zwischenraum
		//-------------------------------------------------------------
		
		for(int i = 1; i < g; i++) {
			System.out.print("  ");
		}
		System.out.println("*");
		
		for(int i = g-1; i > 1; i--) {
			for(int j = 1; j < i ; j++) {
			System.out.print("  ");
		}
			System.out.print("*");
			for(int j = 1; j < (g-i)*2; j++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		
		
		
		
		
		
		//-------------------------------------------------------------

		//Basis
		for(int i = 1; i<= (2*g-1); i++) {
			System.out.print("* ");
		}
		
	}
	
	
	
	private static void Raute2(int g) {
		
		
		//Spitze
		for(int i = 1; i < g; i++) {
			System.out.print("  ");
		}
		System.out.println("*");
		
		
		//Zwischenraum1
		for(int i = g-1; i > 1; i--) {
			for(int j = 1; j < i ; j++) {
			System.out.print("  ");
		}
			System.out.print("*");
			for(int j = 1; j < (g-i)*2; j++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		
		// Zwischenraum2
		for(int i = 1; i <= g-1; i++) {
			for(int j = 1; j < i ; j++) {
			System.out.print("  ");
		}
			System.out.print("*");
			for(int j = 1; j < (g-i)*2; j++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		//Spitze Ende
		for(int i = 1; i < g; i++) {
			System.out.print("  ");
		}
		System.out.println("*");
		
		
	}
	
	
	
	private static void Raute(int g) {
		for(int k = 1; k<=(2*g-2)/2 ; k++) {
			System.out.print("  ");
		}
		System.out.println("*");
		
		for(int i = 1; i <= g-2; i++) {
			
			for(int k = 1; k<=((2*g-2)/2)-i ; k++) {
				System.out.print("  ");
			}
			System.out.print("*");
			for(int k = 1; k<=2*i-1; k++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		
		for(int i = g-3; i >= 1; i--) {
			
			for(int k = 1; k<=((2*g-2)/2)-i ; k++) {
				System.out.print("  ");
			}
			System.out.print("*");
			for(int k = 1; k<=2*i-1; k++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		
		
		
		
		
		
		
		for(int k = 1; k<=(2*g-2)/2 ; k++) {
			System.out.print("  ");
		}
		System.out.println("*");
		
	}
	
	
	private static void Dreieck(int g) {
		//Spitze
		for(int k = 1; k<=(2*g-2)/2 ; k++) {
			System.out.print("  ");
		}
		System.out.println("*");
		
		for(int i = 1; i <= g-2; i++) {
			
			for(int k = 1; k<=((2*g-2)/2)-i ; k++) {
				System.out.print("  ");
			}
			System.out.print("*");
			for(int k = 1; k<=2*i-1; k++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		//Basis
		for(int k = 1; k<=(2*g-1) ; k++) {
			System.out.print("* ");
		}
	}
	
	
	
	
	private static void Quadrat(int g) {
		
		for(int i = 1; i <= g; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i = 1; i <= g-2; i++) {
			System.out.print("*");
			for(int k = 1; k <= g-2; k++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		for(int i = 1; i <= g; i++) {
			System.out.print("* ");
		}
	}

}
