
import java.util.Scanner;

public class bmi
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String [] args){
            System.out.println("*** BMI Calculator ***");
        System.out.println("Enter a Weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter a height in m: ");
        double height = sc.nextDouble();
        double bmi = weight/(height * height);
        
        System.out.println("A " + height + "m tall adult who weighs " + weight + "kg has a BMI of " + bmi);
    }
}
