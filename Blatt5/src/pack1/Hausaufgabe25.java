package pack1;

public class Hausaufgabe25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[10];
		
		for(int i = 0; i < 10; i++) {
			array1[i] = i;
			System.out.print(array1[i]);
		}
		int tmp = array1[0];
		array1[0] = array1[9];
		array1[9] = tmp;
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(array1[i]);
		}

	}

}
