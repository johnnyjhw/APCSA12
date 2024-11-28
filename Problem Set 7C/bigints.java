
import java.util.ArrayList;

public class bigints
{
    public static ArrayList<Integer> add(int num1, int num2){
        ArrayList<Integer> sumlst = new ArrayList<>();
        int morethanten = 0;
        int digit1 = 0;
        int digit2 = 0;
        int sum= 0;
        while(num1 > 0 || num2 > 0 || morethanten > 0){
            digit1 = num1%10;
            digit2 = num2%10;
            sum = digit1 + digit2 + morethanten;
            sumlst.add(0, sum % 10); 
            morethanten = sum/10;
            
            num1 /= 10;
            num2 /= 10;
            
        }
        return sumlst;
    } 
}


