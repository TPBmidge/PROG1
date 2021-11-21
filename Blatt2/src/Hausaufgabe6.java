import static jsTools.Input.*;

public class Hausaufgabe6 {

	public static void main(String[] args) {
		

		int i;
		String s;

		i = readIntW("So kann man nach einer Integer Zahl fragen:");
		System.out.println("Danke:" + i);

		i = jsTools.Input.readIntW("Ihre Eingabe fuer ein int:");
		System.out.println("Danke:" + i);

		System.out.print("Bitte geben Sie einen Text (String) ein:");
		s = readLineW("Bitte Ihr Text:");
		System.out.println("Danke:" + s);

		System.out.println("Ende des Programms");



	}

}
