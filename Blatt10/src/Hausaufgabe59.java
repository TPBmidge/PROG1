import jsTools.Graph;
import static jsTools.Graph.*;
public class Hausaufgabe59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//paintCircle(100,100,500,0);
		addRect(1, 1, 10000, 10000, "hellgrau");
		paintCircle(100,100,500,1);
	}
	
	
	static void paintCircle(int x,int y, int d, int i) {
		System.out.println(i);
		if(i>6) {
			return;
		}else {
			String col = "";
			if(i%2==0) {
				 col = "blue";
			}else {
				col = "white";
			}
			addCircle(x, y, d, col);
			sleep(1000);
			addCircle(x+d, y, d, col);
			sleep(1000);
			paintCircle(x,y+(d/4),d/2,++i);
			
			//paintCircle2(x+d,y+(d/4),d/2,++i);
			
		}
		
	}
	
	static void paintCircle2(int x,int y, int d, int i) {
		System.out.println(i);
		if(i>6) {
			return;
		}else {
			String col = "";
			if(i%2==0) {
				 col = "red";
			}else {
				col = "yellow";
			}
			addCircle(x, y, d, col);
			sleep(1000);
			paintCircle2(x,y+(d/4),d/2,++i);
			
		}
		
	}
	


}
