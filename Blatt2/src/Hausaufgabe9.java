
public class Hausaufgabe9 {

	public static void main(String[] args) {
		System.out.println("Zahl\tQuadrat\tSummeDerZahlen\tSummeDerQuadratzahlen");
		
		int sumZ = 0;
		int sumQZ = 0;
		for(int i = 1; i <= 100; i++) {
			sumZ = sumZ+i;
			sumQZ = sumQZ + (i*i);
			System.out.println(i+"\t"+i*i+"\t"+sumZ+"\t"+sumQZ);
		}

	}

}
