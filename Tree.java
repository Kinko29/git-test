package turtle;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;


public class Tree {
    
    public Tree(double l, Turtle t) {
        if(l < 3)
            return;
        t.fd(l);
        Double pos = t.getPos();
        // right branch
        t.rt(45);
        new Tree(l/2, t);     
        
        // left branch
        t.setPos(pos);
        t.lt(90);
        new Tree(l/2, t);
        
        t.rt(45);
    }

}
