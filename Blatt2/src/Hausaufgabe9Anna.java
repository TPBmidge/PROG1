
public class Hausaufgabe9Anna {

	public static void main(String[] args) {
		System.out.println("Zahl\tQuadrat\tSummeDerZahlen\tSummeDerQuadratzahlen");
		int sumZ = 0;
		int sumQ = 0;
		for(int i = 1; i <=100; i++) {
			sumZ = sumZ + i;
			sumQ = sumQ + (i*i);
			
			System.out.println(i+"\t"+i*i+"\t"+sumZ+"\t"+sumQ);
		}
		
	}
	
	
}
