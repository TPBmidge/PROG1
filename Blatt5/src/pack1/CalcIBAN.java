package pack1;
import static jsTools.Input.*;

import java.text.DecimalFormat;


public class CalcIBAN {

	  //berechnet BBAN
	  public static long calcBBAN(long blz, long ktoNr) {
		  return blz*1000000000*10+ktoNr;
	  }

	  // hier ergaenzen Sie die fehlenden Methoden
	  public static char toBig(char c) {
		  return Character.toUpperCase(c);
	  }
	  
	  public static long calcLandKennung(char land1, char land2) {
		  land1 = toBig(land1);
		  land2 = toBig(land2);
		  String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  return ((abc.indexOf(land1)+1+9)*100+(abc.indexOf(land2)+1+9))*100;
	  }
	  
	  public static String calcPruefziffer(char land1, char land2, long blz, long ktoNr) {
		  long bBan = calcBBAN(blz, ktoNr);
		  long tmp = bBan%97;
		  tmp = 98-(tmp*1000000+calcLandKennung(land1, land2))%97;
		  if(tmp<10) {
			  return "0"+tmp;
		  }
		  return Long.toString(tmp);
	  }
	  
	  public static String calcIBAN(char land1, char land2, long blz, long ktoNr) {
		  return ""+toBig(land1)+toBig(land2)+calcPruefziffer(land1, land2, blz, ktoNr)+calcBBAN(blz, ktoNr);
	  }

	  public static void main(String args[]) {
	    System.out.println();
	    // pruefe Methoden:
	    if ( 700901001234567890l != calcBBAN( 70090100, 1234567890))
	      System.out.println ("Fehler: Berechnung BBAN:" +
	                          " 700901001234567890l != calcBban( 70090100, 1234567890)):"+
	                          calcBBAN( 70090100, 1234567890));
	    else System.out.println("IBAN OK");
	      
	/* Im Laufe der Programmentwicklung verschieben Sie den Beginn dieses Kommentars
	   von Methode zu Methode nach hinten!*/

	    if ( 'A' != toBig('A'))
	      System.out.println ("Konvertierungsfehler: 'A' != toBig('A')");
	    else System.out.println("toBig('A') OK");
	    if ( 'A' != toBig('a'))
	      System.out.println ("Konvertierungsfehler: 'A' != toBig('a')");
	    else System.out.println("toBig('a') OK");
	    if ( 'Z' != toBig('z'))
	      System.out.println ("Konvertierungsfehler: 'Z' != toBig('z')");
	    else System.out.println(toBig('z') + "toBig(z) OK");
	    if ( 'K' != toBig('k'))
	      System.out.println ("Konvertierungsfehler: 'K' != toBig('k')");
	    else System.out.println(toBig('k') + "toBig(k) OK");

	    if ( 131400 != calcLandKennung( 'd','e'))
	      System.out.println ("Fehler: Berechnung Landkennung:" +
	                          " 131400 != calcLandKennung( 'd','e') :"+
	                          calcLandKennung( 'd','e'));
	    else System.out.println("Landkennung OK");
	   

	    if (! "08".equals( calcPruefziffer( 'd','e',70090100, 1234567890)))
	      System.out.println ("Fehler: Berechnung Pruefziffer:" +
	                          " 08 != calcPruefziffer( 'd','e',70090100, 1234567890):"+
	                          calcPruefziffer( 'd','e',70090100, 1234567890));
	    else System.out.println("Pruefziffer OK");
	    
	    if (! "DE08700901001234567890".equals(calcIBAN('d','e',70090100, 1234567890)))
	      System.out.println ("Fehler: Berechnung IBAN:"+
	                          "DE08700901001234567890 ungleich"+
	                          calcIBAN('d','e',70090100, 1234567890));
	    else System.out.println("Berechnung IBAN: OK");

	    char land1=readChar("Bitte geben Sie die erste Stelle der Laenderkennung ein:");
	    char land2=readChar("Bitte geben Sie die zweite Stelle der Laenderkennung ein:");
	    long blz=readInt("Bitte geben Sie die Bankleitzahl ein:");
	    long kontoNr=readInt("Bitte geben Sie die Kontonummer ein:");

	    // Hier folgt der Aufruf fuer die Berechnung: und die Ausgabe
	    System.out.println("IBAN:"+calcIBAN('d','e',blz, kontoNr));
	
	  }
	}

