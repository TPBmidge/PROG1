
public class Hausaufgabe47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spx h = new Spx(5);
		Spx k = new Spx(5);
		System.out.println(Spx.counter);
	}

}

class Spx{
	static int counter = 0;
	int [] arr;
	
	Spx(int lge) {
		arr = new int[lge];
		for (int i = 0; i < arr.length; i++) {
			arr[arr.length-(i+1)] = i+1;
		}
		counter++;
	}
	
}
