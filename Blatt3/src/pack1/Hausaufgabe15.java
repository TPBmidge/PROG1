package pack1;

public class Hausaufgabe15 {

	public static void main(String[] args) {

		System.out.println(getNumberAsWord(56));
	}

	static String getNumberAsWord(int num){

		//Blocks
		String[] Blocks = new String[17];

		Blocks[0] = "null";
		Blocks[1] = "ein";
		Blocks[2] = "zwei";
		Blocks[3] = "drei";
		Blocks[4] = "vier";
		Blocks[5] = "fünf";
		Blocks[6] = "sechs";
		Blocks[7] = "sieben";
		Blocks[8] = "acht";
		Blocks[9] = "neun";
		Blocks[10] = "zehn";
		Blocks[11] = "elf";
		Blocks[12] = "zwölf";
		Blocks[13] = "zwan";
		Blocks[14] = "zig";
		Blocks[15] = "und";
		Blocks[16] = "eins";

		//special case
		switch (num) {
		case 1:
			return Blocks[16];
		case 11:
			return Blocks[11];
		case 12:
			return Blocks[12];
		case 20:
			return Blocks[13];
		default:
			break;
		}

		int tensDigit = num/10;
		int onesDigit = num%10;

		//one digit
		if(tensDigit == 0) {
			return Blocks[num];
		}

		//two digits
		if(tensDigit > 2) {
			return Blocks[onesDigit]+Blocks[15]+Blocks[tensDigit]+Blocks[14];
		}
		if(tensDigit == 2) {
			return Blocks[onesDigit]+Blocks[15]+Blocks[13]+Blocks[14];
		}
		if(tensDigit == 1) {
			return Blocks[onesDigit]+Blocks[10];
		}

		return "ERROR";

	}

}
