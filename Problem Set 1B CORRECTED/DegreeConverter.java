
import java.util.Scanner;

public class DegreeConverter
{
    static Scanner sc= new Scanner(System.in);
    public static void main (String [] args) {
        System.out.println("*** Celsius --> Fahrenheit ***");
        System.out.print("Enter a temperature in Celsius: ");
        double Celsius = sc.nextDouble();
        double CtoF = Celsius * 9/5 + 32;
        
        System.out.println(Celsius + "°" + " Celsius = " + CtoF + "°" + " Fahrenheit");        
    }
}
