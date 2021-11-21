package pack1;

import javax.swing.JOptionPane;

public class Hausaufgabe16 {

	public static void main(String[] args) {
		boolean isInputCorrect = false;
		do {
			int std = Integer.parseInt(JOptionPane.showInputDialog("Stunden:"));
			int min = Integer.parseInt(JOptionPane.showInputDialog("Minuten:"));
			int sec = Integer.parseInt(JOptionPane.showInputDialog("Sekunden:"));

			if (std < 24 && min < 60 && sec < 60) {
				printTimeAsText(std, min, sec);
				isInputCorrect = true;
			} else {
				isInputCorrect = false;
			}
		} while (!isInputCorrect);

	}

	static String zahl2text(int number) {
		return Hausaufgabe15.getNumberAsWord(number);
	}

	static void printTimeAsText(int std, int min, int sec) {
		System.out.println(
				"Es ist " + zahl2text(std) + " Uhr " + zahl2text(min) + " Minuten und " + zahl2text(sec) + " Sekunden");
	}

}
