import static jsTools.Input.*;
public class Hausaufgabe39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		auto1.init("A0F6G", 0, 0, 5000, 2012);
		auto2.readValues();
		auto1.print();
		auto1.driveTo(5, 5);
		auto2.driveTo(8, 8);
		auto1.print();
		auto2.print();
	}

}

class Auto{
	String hersteller;
	int posX;
	int posY;
	double kmStand;
	int baujahr;
	
	void init(String hst, int x, int y, int km, int bj) {
		this.hersteller = hst;
		this.posX = x;
		this.posY = y;
		this.kmStand = km;
		this.baujahr = bj;
	}
	
	void readValues() {
		this.hersteller = readString();
		this.posX = readInt();
		this.posY = readInt();
		this.kmStand = readDouble();
		this.baujahr = readInt();
	}
	
	void driveTo(int xNeu, int yNeu) {
		System.out.println("PreX: "+posX);
		System.out.println("PreY: "+posY);
		
		double distanz = (xNeu-this.posX)*(xNeu-this.posX) + (yNeu-this.posY)*(yNeu-this.posY);
		distanz = Math.sqrt(distanz);
		this.kmStand = this.kmStand+distanz;
		
		this.posX = xNeu;
		this.posY = yNeu;
		
		System.out.println("PostX: "+posX);
		System.out.println("PostY: "+posY);
		
	}
	
	void print() {
		System.out.println("Hersteller: "+ this.hersteller);
		System.out.println("X-Position: "+ this.posX);
		System.out.println("Y-Position: "+ this.posY);
		System.out.println("Kilometerstand: "+ this.kmStand);
		System.out.println("Baujahr: "+ this.baujahr);
	}
}
