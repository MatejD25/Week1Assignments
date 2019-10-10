
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class BarWithPen {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x[] = new int[4];
        String col[] = new String[4];
        PenBar pb1 = new PenBar();
        PenBar pb2 = new PenBar();
        PenBar pb3 = new PenBar();
        PenBar pb4 = new PenBar();
        
        for (int i = 0; i < 4; i++) {
            while(true){
            System.out.print("Enter a value for Graph "+(i+1)+" --> ");
            x[i] = s.nextInt();
            if (x[i]<=500 && x[i]>=0) break;
            System.out.println("Number Must Be From 0-500");
            }
        }
        
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        pb1.draw(p,x[0],100,Color.blue);
        pb2.draw(p,x[1],25,Color.red);
        pb3.draw(p,x[2],-50,Color.green);
        pb4.draw(p,x[3],-125,Color.pink);
        
        for (int i = 0; i < 4; i++) {
            
        }
    }
    
}
