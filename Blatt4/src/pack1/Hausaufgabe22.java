package pack1;

public class Hausaufgabe22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Math.floor(getEinkommssteuer(30000)));
		printEstTabelle(5000, 300000, 1000);

	}
	
	static double getEinkommssteuer(double zvE){
		if(zvE <= 9408) {
			return 0;
		}else if(zvE<=14532) {
			double y = (zvE-9408)/10000;
			return (972.87*y+1400)*y;
		}else if(zvE<=57051) {
			double z = (zvE-14532)/10000;
			return ((212.02*z+2397))*z+972.79;
		}else if(zvE<=270500) {
			return 0.42*zvE-8963.74;
		}else if(zvE>=270501) {
			return 0.45*zvE-17078.74;
		}
		return 0;
	}
	
	
	static void printEstTabelle(int von, int bis, int increment) {
		for(int i = von; i <=bis; i=i+increment) {
			System.out.print("zvE: "+ i+"\t");
			System.out.println("ESt: "+Math.floor(getEinkommssteuer(i)));
		}
	}

}
