import javax.swing.JOptionPane;

public class Hausaufgabe5Anna {

	public static void main(String[] args) {
		int d = Integer.parseInt(JOptionPane.showInputDialog("Bitte Tag im Monat eingeben!"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Bitte Monat im Jahr eingeben!"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Bitte Jahr eingeben!"));

		if(m == 1) {
			m = 13;
			y--;
		}
		if(m == 2) {
			m = 14;
			y--;
		}
		
		y = y%100;
		int c = y/100;
		
		
		int w = (d+(26*(m+1))/10+(5*y/4+c/4+5*c-1))%7;
		
		switch (w) {
		case 0:
			System.out.println("Sonntag");
			break;
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		}
		
		
	}

}
