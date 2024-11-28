
import java.util.ArrayList;

public class goldbach
{
     public static String pnum(int n){
         ArrayList <Integer> primes = new ArrayList<>();
         primes.addAll(eratosthenes.primenum(n));
         int num1 = 0;
         int num2 = 0;
         String result;
         
         for(int i = 0; i < primes.size(); i++){
             for(int j = i; j < primes.size(); j++){
                 if(primes.get(i) + primes.get(j) == n){
                     num1 = primes.get(i);
                     num2 = primes.get(j);
                     break;
                 }
             }
         } 
         result = String.valueOf(num1) + " + " + String.valueOf(num2);
         return result;
     }
}
