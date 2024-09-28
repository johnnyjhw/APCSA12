
import java.util.Scanner;
public class Driver
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        OrderedPair op = new OrderedPair();
        Formula f = new Formula();
        OrderedPair op1 = new OrderedPair(5, 5);
        
        
        System.out.println(op);
        System.out.println(op1);
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c: ");
        System.out.println("enter a: ");
        double a = sc.nextDouble();
        System.out.println("enter b: ");
        double b = sc.nextDouble();
        System.out.println("enter c: ");
        double c = sc.nextDouble();
        System.out.println("The solutions for " + a + "x^2 " + " + " + b + " + "+ "x" + " + "+ c + " are " +f.findQuadraticRoots(a,b,c));
        
        
        System.out.println("");
        System.out.println("SLOPE FORMULA: Find the slope betweem points (x1, y1) and (x2, y2)");
        System.out.println("x1: ");
        double x1 = sc.nextDouble();
        System.out.println("y1: ");
        double y1 = sc.nextDouble();
        System.out.println("x2: ");
        double x2 = sc.nextDouble();
        System.out.println("y2: ");
        double y2 = sc.nextDouble();
        OrderedPair opair1 = new OrderedPair(x1, y1);
        OrderedPair opair2 = new OrderedPair(x2, y2);
        
        System.out.println("A line between (" + x1 + "," + y1 + ")" + "and (" + x2 + "," + y2 + ")" + " has the slope of " + f.findSlope(opair1, opair2));
        
        
        System.out.println("");
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1, y1,) and (x2, y2)");
        System.out.println("x1: ");
        double x11 = sc.nextDouble();
        System.out.println("y1: ");
        double y11 = sc.nextDouble();
        System.out.println("x2: ");
        double x22 = sc.nextDouble();
        System.out.println("y2: ");
        double y22 = sc.nextDouble();
        
        OrderedPair opair11 = new OrderedPair(x11, y11);
        OrderedPair opair22 = new OrderedPair(x22, y22);
        System.out.println("THe midpoint between " + "(" + x11 + "," + y11 + ")" + " and " + "(" + x22 + "," + y22 + ")" + " has a slope of " + f.findMidpoint(opair11, opair22)); 
        
        
        System.out.println("");
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("Number of terms: ");
        int terms = sc.nextInt();
        System.out.println("Starts with: ");
        double starts = sc.nextDouble();
        System.out.println("Increases by: " );
        double increases = sc.nextDouble();
        System.out.println("The sum of the first " + terms + " terms of an arithmetic series that starts with " + starts + " and increases by " + increases + " is " + f.findArithmeticSeriesSum(starts, increases, terms));
        
        System.out.println("");
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.println("Number of terms: ");
        int termsG = sc.nextInt();
        System.out.println("Starts with: ");
        double startsG = sc.nextDouble();
        System.out.println("Increases by: " );
        double ROG = sc.nextDouble();
        System.out.println("The sum of the first " + termsG + " terms of a finite geometric series that starts with " + startsG + " and increases by a rate of " + ROG + " is " + f.findGeometricSeriesSum(startsG, ROG, termsG));
    
        System.out.println("DIE ROLLER");
        System.out.println("How many sides does your die have? ");
        int sides = sc.nextInt();
        System.out.println("Rolling a " + sides + "-sides dies ... you got a " + f.rollDie(sides) + "!");
    }
}
