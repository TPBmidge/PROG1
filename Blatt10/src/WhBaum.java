import static jsTools.Graph.*;
public class WhBaum {
    public static void main(String a[]){
        Baum b[]=new Baum[4];
        b[0]=new Baum(250,100,800);
        b[1]=new Baum(600,200,300);
        b[2]=new Baum(1000,200,500);
        b[3]=new Baum(1400,200,600);
        for (int i = 0; i <b.length ; i++) {
            b[i].paint();
        }
    }
}
