import static jsTools.Graph.*;

import javax.swing.JOptionPane;

import jsTools.Graph;
public class Hausaufgabe30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		initWindow();
		
		//int spaltenAnzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl Spalten"));
		//int zeilenAnzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl Zeilen"));
		//paintSchach(spaltenAnzahl*40,zeilenAnzahl*40);
		paintSchach800(95,160);
		//Test3ff
		
		
	}
	
	static void paintSchach800(int n, int m) {
		addRect(0,0,800,800,"grey");
		int odd1 = 1;
		int y = 0;
		for(int i = 0; i <= 800-m; i = i+m) {
			int odd2 = odd1;
			for(int j = 0; j <= 800-n; j=j+n) {
				if(odd2%2==0) {
					addRect(j, y, n,m, "white");
				}else {
					addRect(j, y, n,m, "black");
				}
				odd2++;
			}
			y = y+m;
			odd1++;
		}
	}
	
	static void paintSchach(int n, int m) {
		addRect(0,0,n,m,"grey");
		int odd1 = 1;
		int y = 0;
		for(int i = 0; i <= m-40; i = i+40) {
			int odd2 = odd1;
			for(int j = 0; j <= n-40; j=j+40) {
				if(odd2%2==0) {
					addRect(j, y, 40,40, "white");
				}else {
					addRect(j, y, 40,40, "black");
				}
				odd2++;
			}
			y = y+40;
			odd1++;
		}
		
		
		
	}

}
