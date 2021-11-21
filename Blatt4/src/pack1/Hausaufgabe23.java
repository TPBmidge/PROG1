package pack1;

public class Hausaufgabe23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(crypt('a',2));
		//System.out.println(decrypt('c', 2));
		System.out.println(decryptText("INJXJW YJCY NXY OJYEY JSYXHMQZJXXJQY", 5));
		
		for(int i = 1; i<=25;i++) {
			System.out.println(decryptText("HPC SLE KFPCDE OLD CLPEDPW RPWZPDE - PC DNSCPTMP XTC MTEEP PTYP XLTW", i));
		}
	}
	
	public static String cryptText(String s, int n) {
		String cryptedSt = "";
		for(int i = 0;i<s.length(); i++) {
			cryptedSt += crypt(s.charAt(i),n);
		}
		return cryptedSt;
	}
	
	public static String decryptText(String s, int n) {
		String cryptedSt = "";
		for(int i = 0;i<s.length(); i++) {
			cryptedSt += decrypt(s.charAt(i),n);
		}
		return cryptedSt;
	}
	
	public static char crypt(char c, int n) {
		c = Character.toUpperCase(c);
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if(abc.indexOf(c)<0) {
			return c;
		}
		int indexOfChar = abc.indexOf(c);
		int indexOfCryptedChar = indexOfChar+n;
		
		
		if(indexOfCryptedChar/26*-1>0) {
			System.out.println(indexOfCryptedChar);
			System.out.println(indexOfCryptedChar/26);
			indexOfCryptedChar = indexOfCryptedChar*-1;
			indexOfCryptedChar = ((indexOfCryptedChar/26)*26)-indexOfCryptedChar;
		}
		if(indexOfCryptedChar<0) {
			indexOfCryptedChar = indexOfCryptedChar+26;
		}
		
		if(indexOfCryptedChar/26>0) {
			indexOfCryptedChar = indexOfCryptedChar-((indexOfCryptedChar/26)*26);
		}
		
		return abc.charAt(indexOfCryptedChar);
	}
	
	public static char decrypt(char c, int n) {
		return crypt(c,n*-1);
	}

}
