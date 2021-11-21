import javax.swing.JOptionPane;

public class Hausaufgabe7Anna {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Gib Zahl ein!"));
		
		
		if(num == 1) {
			System.out.println(num);
		}else {
			int erg = num;
			for(int i = num-1; i >= 1; i--) {
				erg = erg*i;
				
			}
			
			System.out.println(erg);
		}

	}

}
