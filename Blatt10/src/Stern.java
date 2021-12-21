import static jsTools.Graph.*;

class Stern{
    int x,y,d;
    String col;

    public Stern(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
        col=yellow;
    }

    void paint(){
        addTriangle(x,y,d,d,0,col);
        addTriangle(x,y,d,d,90,col);
        addTriangle(x,y,d,d,180,col);
        addTriangle(x,y,d,d,270,col);
    }
}