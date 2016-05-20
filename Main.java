package turtle;
import java.awt.Color;
import java.awt.geom.Point2D.Double;

import ch.aplu.turtle.*;

public class Main {
    
    static Turtle t;

    public static void main(String[] args) {
        t = new Turtle();
        t.hideTurtle();
        tree(128);
    }
    
    
    static void tree(double l) {
        if(l < 3)
            return;
        t.fd(l);
        Double pos = t.getPos();
        // right branch
        t.rt(45);
        tree(l/2);     
        
        // left branch
        t.setPos(pos);
        t.lt(90);
        tree(l/2);
        
        t.rt(45);
    }

}
