
import hsa.Console;
import java.awt.Color;


public class BarGraphWithObject {

    public static void main(String[] args) {
        Console c = new Console();
        Bar b1 = new Bar();
        Bar b2 = new Bar();
        Bar b3 = new Bar();
        Bar b4 = new Bar();
        c.print("Enter Height Of Bar 1 --> ");
        b1.height = c.readInt();
        b1.xloc=100;
        b1.col = Color.red;
        c.print("Enter Height Of Bar 2 --> ");
        b2.height = c.readInt();
        b2.xloc=200;
        b2.col = Color.blue;
        c.print("Enter Height Of Bar 3 --> ");
        b3.height = c.readInt();
        b3.xloc=300;
        b3.col = Color.yellow;
        c.print("Enter Height Of Bar 4 --> ");
        b4.height = c.readInt();
        b4.xloc=400;
        b4.col = Color.green;
        b1.draw(c);
        b2.draw(c);
        b3.draw(c);
        b4.draw(c);
    }
    
}
