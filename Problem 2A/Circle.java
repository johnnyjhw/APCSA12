public class Circle
{
    double radius;
    
    public Circle() {
        radius = 1;
    }
    
    public Circle(double r) {
        //parameterized constructor
        radius = r;
    }
    
    //Behaviour methods
    public String toString() {
        return "Hello, I am a circle with a radius of " + radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double circumference () {
        return radius*2*Math.PI;
    }
    
    public double area () {
        return Math.PI * radius * radius;
    }

}















