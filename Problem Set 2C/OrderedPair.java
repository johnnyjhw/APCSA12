
/**
 * Write a description of class OrderedPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderedPair
{
    double x;
    double y;
    
    public OrderedPair() {
        x = 0;
        y = 0;
    }
    
    public OrderedPair(double ex, double why) {
        x = ex;
        y = why;
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}
