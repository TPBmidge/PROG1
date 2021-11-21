import javax.swing.JOptionPane;

public class Hausaufgabe7 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben:"));
//		for(int i = n; i > 1; i--) {
//			System.out.println(n+"\tx\t"+(i-1)+"\t=\t"+n*(i-1));
//			n = n*(i-1);
//		}
		System.out.println(Fakult(n));

	}
	
	private static int Fakult(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return Fakult(n-1)*n;
		}
	}

}
