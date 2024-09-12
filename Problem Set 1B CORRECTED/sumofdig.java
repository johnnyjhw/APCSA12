
import java.util.Scanner;

public class sumofdig {
    static Scanner sc= new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("*** Sum of digits ***");
        System.out.println("Enter a positive, three-digit- number: ");
        int num = sc.nextInt();
        int digitone  = (num%100)%10;
        int digittwo  = (num%100)/10;
        int digitthree = num/100;
        int sum = digitone + digittwo + digitthree;
        System.out.println("The sum of the digits of " + num + " is " + sum);
    }
}
