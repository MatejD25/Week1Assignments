
import hsa.Console;
import java.awt.Color;


public class Wagon {


    public static void main(String[] args) {
        Console c =new Console();
        c.setColour(Color.cyan);
        c.fillRect(0,0,2000,500);
        c.setColour(Color.green);
        c.fillRect(0,300,2000,200);
        c.setColour(Color.magenta);
        c.fillRect(175,325,300,100);
        c.setColour(Color.black);
        c.fillOval(200, 400, 50, 50);
        c.fillOval(400, 400, 50, 50);
        c.drawLine(175, 325, 100, 225);
        c.setColour(Color.yellow);
        c.fillOval(500, 50, 100, 100);
        
    }
    
}
