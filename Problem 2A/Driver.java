
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver{
    public static void main (String [] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        
        System.out.println("Creating a circle with the default constructor!");
        System.out.println(c1);
        System.out.println("getRadius() --> " + c1.getRadius() + " units");
        System.out.println("circumference() " + c1.circumference());
        System.out.println("area() --> " + c1.area() + " units^2");
        System.out.println("");
        
        System.out.println("Creating a circle with the parameterized constructor!");
        System.out.println(c2);
        System.out.println("getRadius() --> " + c2.getRadius() + " units");
        System.out.println("circumference() " + c2.circumference());
        System.out.println("area() --> " + c2.area() + " units");
        

    }
    
    
    
}
