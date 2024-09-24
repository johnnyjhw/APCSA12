public class Cylinder {
 
    private double height;
    private Circle base;

    
    public Cylinder() {
        height = 1.0;
        base = new Circle(1.0);
    }

    public Cylinder(double h, double radius) {
        height = h;
        base = new Circle(radius);
    }

     public String toString() {
        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " and height of " + height;
    }
    
    
    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return base.getRadius();
    }

 
    public double getSurfaceArea() {
        return base.area()*2 + height*base.circumference();
    }


    public double volume() {
        return base.area()*height;
    }

   
}
