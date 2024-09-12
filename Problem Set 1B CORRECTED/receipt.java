
import java.util.Scanner;

public class receipt 
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("*** Receipt Generator ***");
        System.out.println("Number of units you're buying: ");
        int units = sc.nextInt();
        System.out.print("Price per unit: ");
        double price = sc.nextDouble();
        System.out.print("Tax rate: ");
        double tax = sc.nextDouble();
        double cost = units*price * (1.0+(tax/100.0));
        
        System.out.println("Purchasing " + units + " units at " + "$" + price + " with " + tax+ "% tax will cost " + "$" + cost);

    }
}
