
import java.util.ArrayList;

public class eratosthenes
{
    public static ArrayList<Integer> primenum(int n){
        ArrayList <Integer> lst = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            lst.add(i);
        }
        
        int counter = 0;
        int p;
        while(counter < lst.size()){
            p = lst.get(counter);
            
            for(int i = counter + 1; i < lst.size(); i++){
                if(lst.get(i) % p == 0){
                    lst.remove(i);
                    i--;
                }
            }
            counter++;        
        }
        return lst;
    }
}
