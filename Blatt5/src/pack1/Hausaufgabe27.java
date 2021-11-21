package pack1;

import static jsTools.Input.*;

public class Hausaufgabe27 {

	static String[] table = { "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "UFLPWDRASJMCONQYBVTEXHZKGI" };

	public static void main(String[] args) {
		String ln;
		fileReadOpen("Sub2.txt");
		ln = fileReadLine();
		System.out.println(ln);
		table[0] = ln;
		ln = fileReadLine();
		table[1] = ln;
		System.out.println(ln);

		fileReadOpen("Geheim.txt");
		ln = fileReadLine();
		while (ln != null) {
			ln = decryptText(ln);
			System.out.println(ln);
			ln = fileReadLine();
		}
	}

	public static char crypt(char c, String[] table) {
		c = Character.toUpperCase(c);
		return table[1].charAt(table[0].indexOf(c));
	}

	public static char decrypt(char c, String[] table) {
		c = Character.toUpperCase(c);
		if (table[1].indexOf(c) < 0) {
			return ' ';
		}
		return table[0].charAt(table[1].indexOf(c));
	}

	public static String cryptText(String s) {
		String erg = "";
		for (int i = 0; i < s.length(); i++) {
			erg = erg + crypt(s.charAt(i), table);
		}
		return erg;
	}

	public static String decryptText(String s) {
		String erg = "";
		for (int i = 0; i < s.length(); i++) {
			erg = erg + decrypt(s.charAt(i), table);
		}
		return erg;
	}

//	static void getCryptTab(){
//	int[] sortedTab = new int[26];
//	String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	String ln;
//	fileReadOpen("Geheim.txt");
//	ln = fileReadLine();
//	while(ln != null) {
//		for(int i = 0; i < ln.length()-1; i++) {
//			if(abc.indexOf(ln.charAt(i))>0) {
//				sortedTab[abc.indexOf(ln.charAt(i))]++;
//			}
//		}
//		ln = fileReadLine();
//	}
//	String crypt="";
//	int []unsortedTab	= Arrays.copyOf(sortedTab, 26);
//	Arrays.sort(sortedTab);
//	for(int i = 0; i < 26; i++) {
//		for(int j = 0; j < 26; j++) {
//			if(unsortedTab[j]==sortedTab[25-i]) {
//				crypt+=abc.charAt(j);
//				unsortedTab[j]=-1;
//			}
//		}
//		
//	}
//	System.out.println(crypt);
//	String haufig = "ENISRATDHULCGMOBWFKZPVSJYXQ";
//	String crypt2 = "";
//	for(int i= 0; i<26; i++) {
//		
//	}
//}
}
