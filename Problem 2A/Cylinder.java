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
        double radius = base.getRadius();
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }


    public double volume() {
        double radius = base.getRadius();
        return Math.PI * radius * radius * height;
    }

   
}
