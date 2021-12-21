import static jsTools.Graph.*;
import java.util.concurrent.ThreadLocalRandom;
class Baum{
    int x,y,h,b;
    String col=green;   // static String green="green"
    Kugel kugeln[];
    Kerze kerzen[];
    Stern sterne[];
    int kD=10;

    public Baum(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
        b=h/2; // Baum soll halb so breit, wie hoch sein
        kugeln=new Kugel[80];
        for (int i = 0; i < kugeln.length; i++) {
        	int randomNumY = ThreadLocalRandom.current().nextInt(y+5,y+(h-kD));
        	int randomNumX = ThreadLocalRandom.current().nextInt(x-(((randomNumY-y)*5/20)),x+((randomNumY-y)*5/20));
            //kugeln[i]=new Kugel(x+i*10,y+h/2+i*10,kD);
            kugeln[i]=new Kugel(randomNumX,randomNumY,kD);
        }
        kerzen=new Kerze[50];
        for (int i = 0; i < kerzen.length; i++) {
        	int randomNumY = ThreadLocalRandom.current().nextInt(y+5,y+(h-kD));
        	int randomNumX = ThreadLocalRandom.current().nextInt(x-(((randomNumY-y)*5/20)),x+((randomNumY-y)*5/20));
        	kerzen[i]=new Kerze(randomNumX,randomNumY);
		}
        sterne=new Stern[50];
        for (int i = 0; i < sterne.length; i++) {
        	int randomNumY = ThreadLocalRandom.current().nextInt(y+5,y+(h-kD));
        	int randomNumX = ThreadLocalRandom.current().nextInt(x-(((randomNumY-y)*5/20)),x+((randomNumY-y)*5/20));
        	sterne[i]=new Stern(randomNumX,randomNumY,kD);
		}
        
        
    }
    
    public Baum(int x, int y, int h, int anzKugeln, int anzKerzen, int anzSterne) {
        this.x = x;
        this.y = y;
        this.h = h;
        b=h/2; // Baum soll halb so breit, wie hoch sein
        kugeln=new Kugel[anzKugeln];
        for (int i = 0; i < kugeln.length; i++) {
        	int randomNumY = ThreadLocalRandom.current().nextInt(y+5,y+(h-kD));
        	int randomNumX = ThreadLocalRandom.current().nextInt(x-(((randomNumY-y)*5/20)),x+((randomNumY-y)*5/20));
            //kugeln[i]=new Kugel(x+i*10,y+h/2+i*10,kD);
            kugeln[i]=new Kugel(randomNumX,randomNumY,kD);
        }
        kerzen=new Kerze[anzKerzen];
        for (int i = 0; i < kerzen.length; i++) {
        	int randomNumY = ThreadLocalRandom.current().nextInt(y+5,y+(h-kD));
        	int randomNumX = ThreadLocalRandom.current().nextInt(x-(((randomNumY-y)*5/20)),x+((randomNumY-y)*5/20));
        	kerzen[i]=new Kerze(randomNumX,randomNumY);
		}
        sterne=new Stern[anzSterne];
        for (int i = 0; i < sterne.length; i++) {
        	int randomNumY = ThreadLocalRandom.current().nextInt(y+5,y+(h-kD));
        	int randomNumX = ThreadLocalRandom.current().nextInt(x-(((randomNumY-y)*5/20)),x+((randomNumY-y)*5/20));
        	sterne[i]=new Stern(randomNumX,randomNumY,kD);
		}
        
        
    }
    void paint(){
        addTriangle(x,y+h,b,h,0,col);   // Baumkrone
        addRect(x-b/20,y+h,b/10,h/10,brown);  // Stamm
        for (int i = 0; i < kugeln.length; i++) {
            kugeln[i].paint();
        }
        for (int i = 0; i < kerzen.length; i++) {
            kerzen[i].paint();
        }
        for (int i = 0; i < sterne.length; i++) {
            sterne[i].paint();
        }
    }
}

