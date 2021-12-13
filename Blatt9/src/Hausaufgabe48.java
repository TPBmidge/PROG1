import static jsTools.Input.*;
public class Hausaufgabe48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setEctsPunkte(20);
		student1.moveToNextSemester();
		student1.setEctsPunkte(30);
		student1.moveToNextSemester();
		System.out.println(student1);
		
		Student student2 = new Student("Maria","Huber","WI");
		student2.setEctsPunkte(105);
		student2.moveToNextSemester();
		student2.moveToNextSemester();
		student2.moveToNextSemester();
		student2.moveToNextSemester();
		student2.moveToNextSemester();
		student2.moveToNextSemester();
		System.out.println(student2);
	}
}

class Student{
	String vorname;
	String nachname;
	String studiengang;
	int semester;
	int ectsPunkte;
	static int anzahlStudenten;
	final int maxSemester = 10;
	
	Student(String vorname, String nachname, String studiengang){
		this.vorname = vorname;
		this.nachname = nachname;
		this.studiengang = studiengang;
		this.semester = 1;
	}
	
	Student(){
		this.vorname = readString("Vorname: ");
		this.nachname = readString("Nachname: ");
		this.studiengang = readString("Studiengang: ");
		this.semester = 1;
	}
	
	public String toString() {
		return this.vorname+" "+this.nachname+" "+this.studiengang+" "+this.semester;
	}
	
	static int getAnzahlStudenten(){
		return anzahlStudenten;
	}
	
	void setEctsPunkte(int punkte) {
		this.ectsPunkte = punkte;
	}
	
	boolean moveToNextSemester() {
		if(semester == 2 && ectsPunkte < 30) {
			return false;
		}
		if(semester == 4 && ectsPunkte < 90) {
			return false;
		}
		if(semester == 5 && ectsPunkte < 105) {
			return false;
		}
		else {
			semester++;
			return true;
		}
	}
	
	static int getAnzahlInstanzen(){
		return anzahlStudenten;
	}
	
}
