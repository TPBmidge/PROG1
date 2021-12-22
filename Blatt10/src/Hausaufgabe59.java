import jsTools.Graph;
import static jsTools.Graph.*;
public class Hausaufgabe59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paintCircle(100,100,500,0);

	}
	
	static void paintCircle(int x,int y, int d, int i) {
		if(d<=0) {
			return;
		}else {
			String col = "";
			if(i==1) {
				 col = "red";
			}else {
				col = "blue";
			}
			addCircle(x, y, d, col);
			if(i==1)
			paintCircle(x,y+(d/4),d/2,0);
			else
			paintCircle(x,y+(d/4),d/2,1);
		}
		
	}
	
	static void paintCircle2(int x,int y, int d, int i) {
		if(d<=0) {
			return;
		}else {
			String col = "";
			if(i==1) {
				 col = "red";
			}else {
				col = "blue";
			}
			addCircle(x, y, d, col);
			if(i==1)
			paintCircle(x,y+(d/4),d/2,0);
			else
			paintCircle(x,y+(d/4),d/2,1);
		}
		
	}

}
