import static jsTools.Graph.*;

class Kugel{
    int x,y,d;
    String col;

    public Kugel(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
        col=red;
    }

    void paint(){
        addCircle(x,y,d,col);
    }
}

