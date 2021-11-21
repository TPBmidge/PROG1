package pack1;
import static jsTools.Wand.*;

public class Hausaufgabe17 {
	static int speed = 10;
	static int pause=500;

	public static void main(String[] args) {
		// initialisieren der Wand
		initWand();
		//paintRe(2, 2, 10, 10, "black");
		
		paintRe(0,0, 24, 24,"blue");

	}
	
	static void paintDiagonale(String color) {
		// zeichne Diagonale
				for (int i=0; i<24; i++){
				  setWandColor(i, i, color);
				  paintWandNew();
				  sleep (speed);
				}
	}
	
	static void paintGegenDiagonale(String color) {
		// zeichne Gegendiagonale
				for (int i=0; i<24; i++){
				  setWandColor(23-i, i, color);
				  paintWandNew();
				  sleep (speed);
				}
	}
	
	static void paintHor(int zeile, String color) {
		// zeichne horizontalen Balken
				for (int i=0; i<24; i++){
				  setWandColor(zeile, i, color); // pixel setzen
				  paintWandNew();               // Wand neu zeichnen
				  sleep (speed);                // speed ms warten, damit man Bild wachsen sieht 
				}
	}
	
	static void paintVer(int spalte, String color) {
		// zeichne vertikalen Balken
				for (int i=0; i<24; i++){
				  setWandColor(i, spalte, color);
				  paintWandNew();
				  sleep (speed);
				}
	}
	
	static void paintHor2(int zeile, int from, int lge, String color) {
		// zeichne horizontalen Balken
		for (int i=0; i<lge; i++){
		  setWandColor(zeile, i+from, color); // pixel setzen
		  paintWandNew();               // Wand neu zeichnen
		  sleep (speed);                // speed ms warten, damit man Bild wachsen sieht 
		}
	}
	
	static void paintVer2(int spalte, int from, int lge, String color) {
		// zeichne vertikalen Balken
		for (int i=0; i<lge; i++){
		  setWandColor(i+from, spalte, color);
		  paintWandNew();
		  sleep (speed);
		}
	}
	
	static void paintRe(int z0, int s0, int breite, int hoehe, String color) {
		paintHor2(z0, s0, breite, color);
		paintHor2(z0+hoehe-1, s0, breite, color);
		paintVer2(s0, z0, hoehe, color);
		paintVer2(s0+breite-1, z0, hoehe, color);
	}
}
