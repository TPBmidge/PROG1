import static jsTools.Input.*;  // zum Einlesen von der Konsole
import static jsTools.Graph.*;  // zum Zeichnen
public class Hausaufgabe31 {

	 static boolean ueberlappung(int xR1, int bR1, int yR1, int hR1,int xR2, int bR2,int yR2,int hR2) {
	        // hier gehoert ihre Loesung hin
		 if(xR2+bR2>=xR1 && xR2<=xR1+bR1 && yR2+hR2>=yR1 && yR2<=yR1+hR1) {
			 return true;
		 }
			 return false;
	  }

	  static void moveRechteck(int xR1,  int yR1, int bR1,int hR1, int b, int h) {
	    int r=addRect(0,0 , b, h, "green" );

	    for (int y=10;y<400;y+=10) {
	      for (int x=10;x<400;x+=10) {
	        setPos(r,x,y);
	        if ( ueberlappung(xR1,bR1,yR1,hR1,x,b,y,h)) {
	          setColor(r,"red");
	        } else
	          setColor(r,"green");
	        paintNew();
	        sleep(10);
	      }
	    }
	  }

	  static void film() {
	    // R1 das feststehende Rechteck
	    int xR1=200;
	    int yR1=190;
	    int bR1=100;
	    int hR1=150;
	    addRect(xR1, yR1, bR1, hR1, "blue" );

	    // hier kommt das bewegte Rechteck 4 Faelle
	    moveRechteck(xR1, yR1, bR1, hR1,80, 100);
	    moveRechteck(xR1, yR1, bR1, hR1,160, 100);
	    moveRechteck(xR1, yR1, bR1, hR1,80, 180);
	    moveRechteck(xR1, yR1, bR1, hR1,160, 180);

	  }
	  public static void main(String args[]) {
	    film();
	  }//end of main

}
