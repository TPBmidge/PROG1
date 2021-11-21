package pack1;
import static jsTools.Input.*;

public class Meister {
	public static void main(String[] args) {
		fileReadOpen("sub2.txt");
		fileReadLine();
		String sEinlesen = fileReadLine();
		char cKlar;
		char[] cSub = new char[sEinlesen.length()];
		String sSub = "";
		for (int i = 0; i < sEinlesen.length(); i++) {
			cSub[i] = sEinlesen.charAt(i);
			sSub += sEinlesen.charAt(i) + " ";
		}
		System.out.println(decryptText("MDSRTZWNKPYIEFGHCOLQUBVJXA", cSub));


    
	    fileReadOpen("Geheim.txt");
	    String sAusgabe = "";
	    String ln = "";
	    ln =fileReadLine();
	    while (ln != null) {
	    	 System.out.println(decryptText(ln, cSub));
	    	ln = fileReadLine();
	    	sAusgabe += ln;
	     
	    }
	    int[] cALP = new int[26];
	    for(int i = 0 ; i<cALP.length; i++) {
	    	cALP[i] = i;
	    }
	    for(int i = 0; i <sAusgabe.length(); i++) {
	    	for(int j = 0; j < cALP.length; j++) {
	    		if(sAusgabe.charAt(i) == (char)(j+65)) {
	    			cALP[j] += 1;
	    		}
	    	}
	    }
	    for(int i = 0 ; i<cALP.length; i++) {
	    	System.out.println((char) (i +65) + ";" + cALP[i]);
	    }
	}

	static char crypt(char c, char[] cSub) {
		c = cSub[c - 65];
		return c;
	}

	static char decrypt(char c, char[] cSub) {
		char cBack;
		for (int i = 0; i < cSub.length; i++) {
			if (c == cSub[i]) {
				cBack = (char) (i + 65);
				return cBack;
			}
		}
		return c;
	}

	static String cryptText(String sEingabe, char[] cSub) {
		sEingabe = sEingabe.toUpperCase();
		String sAusgabe = "";
		char cPuffer;
		for (int i = 0; i < sEingabe.length(); i++) {
			if (sEingabe.charAt(i) >= 65 && sEingabe.charAt(i) <= 90) {
				cPuffer = crypt(sEingabe.charAt(i), cSub);
				sAusgabe += cPuffer;
			} else {
				sAusgabe += sEingabe.charAt(i);
			}
		}
		return sAusgabe;
	}

	static String decryptText(String sEingabe, char[] cSub) {
		String sAusgabe = "";
		char cPuffer;
		for (int i = 0; i < sEingabe.length(); i++) {
			if (sEingabe.charAt(i) >= 65 && sEingabe.charAt(i) <= 90) {
				cPuffer = decrypt(sEingabe.charAt(i), cSub);
				sAusgabe += cPuffer;
			} else {
				sAusgabe += sEingabe.charAt(i);
			}
		}
		return sAusgabe;
	}
}
