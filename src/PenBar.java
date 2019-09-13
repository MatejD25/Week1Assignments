import TurtleGraphics.Pen;
import java.awt.Color;


public class PenBar {
    int xloc,yloc,height;
    Color col;
    
    public void draw(Pen p,int size,int yloc,Color c){
        p.setColor(c);
        p.setWidth(50);
        p.up();
        p.move(-285,yloc);
        p.setDirection(0);
        p.down();
        p.move(size);
}
}
