
import java.util.Scanner;

public class daysToweeks
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("*** Days --> Weeks and Days ***");
        System.out.println("Enter a number of days: ");
        int days = sc.nextInt();
        int week = days/7;
        int dayRemainder = days%7;
        System.out.println(days + " days is equal to " + week + " weeks, " + dayRemainder + " days.");
    }
}
