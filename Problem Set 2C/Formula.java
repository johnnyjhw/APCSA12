
/**
 * Write a description of class Formula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formula
{
    public OrderedPair findQuadraticRoots (double a, double b, double c){
        double insidesqrt = Math.pow(b,2)-4*a*c;
        double positive = ((-1*b) + Math.sqrt(insidesqrt))/(2*a);
        double negative = ((-1*b) - Math.sqrt(insidesqrt))/(2*a);
        
        return new OrderedPair(positive, negative);
    }

    public double findSlope (OrderedPair A, OrderedPair B){
        double rise = B.getY() - A.getY();
        double run = B.getX() - A.getX();
        return rise/run;
    }
    
    public OrderedPair findMidpoint(OrderedPair A, OrderedPair B){
        double x = (A.getX() + B.getX())/2;
        double y = (A.getY()+ B.getY())/2;
        return new OrderedPair(x,y);
    }

    public double findArithmeticSeriesSum (double a, double d, int k) {
        double seriessum = (double) ((k/2.0)*(2 * a + d * (k-1)));
        return seriessum;
    }

    public double findGeometricSeriesSum (double a, double r, int k){
        double top =  1 - Math.pow(r, k);
        double bottom = 1 - r;
        
        return a*(top/bottom);
    }
    
    public int rollDie (int sides) {
      int random = (int) (Math.random() * sides) + 1;
      return random;
    }
    }

