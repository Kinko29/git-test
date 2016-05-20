package turtle;
import java.awt.Color;
import java.awt.geom.Point2D.Double;

import ch.aplu.turtle.*;

public class Main {
    
    static Turtle t;

    public static void main(String[] args) {
        t = new Turtle();
        t.hideTurtle();
        t.back(100);
        t.setPenColor(Color.RED);
        new Tree(128, t);
    }

}
