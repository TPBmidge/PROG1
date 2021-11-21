package pack1;

public class Hausaufgabe12Anna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		onlyPrinting();
		System.out.println(genLineWithIdentedStars(5,7));
		System.out.println(pow(2,0));
		
	}
 static void onlyPrinting() {
	 System.out.println("bla");
 }
 
 static String genLineWithIdentedStars(int indet, int count) {
	 String rueckgabe = "hallo";
	 
	 
	 for (int i=1; i<=indet; i++) {
		 rueckgabe = rueckgabe + " ";
	 }
	 
	 for (int i=1; i<=count; i++) {
		 rueckgabe = rueckgabe + "*";
	 }
	 
	 return rueckgabe;
	 
 }
 
 static int pow(int x, int y) {
	int g = 1;
	 for (int i = 1; i<= y; i++) {
		 g= g*x;
		 
		 
	 }
	 return g;
 }
}



