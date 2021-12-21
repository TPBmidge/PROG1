import static jsTools.Graph.*;

class Kerze{
    int x,y,h;
    final int b=6;
    //x,y ist bei der Kerze die "Wurzel" -> unten Mitte
    String col;

    public Kerze(int x, int y) {
        this.x = x;
        this.y = y;
        this.h = 30;
        col=red;
    }
    void paint(){
        addRectBorder(x-b/2,y-h,b,h,col);
        addCircle(x-b*3/4,y-h-b,b*3/2,yellow);  //Flamme oberhalb der Kerze
    }
}

