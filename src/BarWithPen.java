
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class BarWithPen {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(640,480));

        PenBar pb1 = new PenBar();
        PenBar pb2 = new PenBar();
        PenBar pb3 = new PenBar();
        PenBar pb4 = new PenBar();
        
        pb1.draw(p,200,100,Color.blue);
        pb2.draw(p,200,25,Color.red);
        pb3.draw(p,200,-50,Color.green);
        pb4.draw(p,200,-125,Color.yellow);
    }
    
}
