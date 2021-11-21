
public class Hausaufgabe11 {

	public static void main(String[] args) {
		System.out.println("----|-----------------------------------------------------------------------------------|");
		System.out.println("    |\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t|");
		System.out.println("----|-----------------------------------------------------------------------------------|");
		
		for(int i = 1; i <=10 ; i++) {
			String str = String.format("%2d  |", i);
			System.out.print(str);
			for(int k = 1; k<=10; k++) {
				System.out.print("\t"+k*i);
			}
			System.out.println("\t|");
		}
		System.out.println("----|-----------------------------------------------------------------------------------|");

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
