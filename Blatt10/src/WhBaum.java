import static jsTools.Graph.*;
public class WhBaum {
    public static void main(String a[]){
        Baum b[]=new Baum[2];
        b[0]=new Baum(50+200,100,800);
        b[1]=new Baum(550+150,200,300);

        for (int i = 0; i <b.length ; i++) {
            b[i].paint();
        }
    }
}
