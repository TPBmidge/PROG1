package pack1;
import static jsTools.Graph.*;

public class Aufgabe21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//runningBallFor();
		runningBallWhile();
		
		
	}
	
	static void runningBallWhile() {
		int px=10,    // x Position des Kreises 
			    kreis;    // Elementnummer des Kreises
			int py=500; // y-Position des Kreises

			addRect(10,10,680,680,"grey");
			kreis=addCircleBorder(px,py,30,"blue");


			while(px <= 657) {
				sleep(10); 
				px=px+2;
				moveElement(kreis, px, py);
			}
			
			while(px > 10 && py>10) {
				sleep(10); 
				px=px-2;
				py = py-1;
				moveElement(kreis, px, py);
			}
		
	}
	
	static void runningBallFor() {
		
			
	}
	
	
	
	static void moveElement(int elNum, int toX, int toY){
		  setPos(elNum,toX, toY);
		  paintNew();
		}

}
