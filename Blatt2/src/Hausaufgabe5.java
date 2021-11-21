import javax.swing.JOptionPane;

public class Hausaufgabe5 {

	public static void main(String[] args) {
		//Eingabe
		String tagStr = JOptionPane.showInputDialog("Tag im Monat:");
		String monatStr = JOptionPane.showInputDialog("Tag im Monat:");
		String jahrStr = JOptionPane.showInputDialog("Tag im Monat:");
		
		//Parsing
		int d = Integer.parseInt(tagStr);
		int m = Integer.parseInt(monatStr);
		int y = Integer.parseInt(jahrStr);
		
		
		//Verarbeitung----------------------------
		
		//Monat kleiner 3
		if(m == 1) {
			y--;
			m = 13;
		}
		if(m == 2) {
			y--;
			m = 14;
		}
		
		
		int c = y/100;
		y = y%100;
		
		System.out.println("d = "+d);
		System.out.println("m = "+m);
		System.out.println("y = "+y);
		System.out.println("c = "+c);
		
		int w = (d+((26*(m+1))/10)+((5*y)/4)+(c/4)+(5*c)-1)%7;
		
		System.out.println(w);
		
		switch (w) {
		case 0: System.out.println("Sonntag");
		break;
		case 1: System.out.println("Montag");
		break;
		case 2: System.out.println("Dienstag");
		break;
		case 3: System.out.println("Mittwoch");
		break;
		case 4: System.out.println("Donnerstag");
		break;
		case 5: System.out.println("Freitag");
		break;
		case 6: System.out.println("Samstag");
		break;
		}
		
		JOptionPane.showMessageDialog(null, w);
		

	}

}
