package pack1;

public class Aufgabe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primzahlen
		int count = 0;
		for (int i  = 2; i<=1000; i++) {
			boolean isPrimeNumber = true;
			for(int j = 2; j<i; j++)
				if((i%j)==0) {
					isPrimeNumber = false;
				}
			if(isPrimeNumber) {
				count++;
				System.out.print(i+"\t");
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("\nAnzahl der Primzahlen: "+count);

	}

}
