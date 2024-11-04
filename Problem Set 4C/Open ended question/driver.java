
import java.util.Scanner;
public class driver
{
   public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter a message: ");
        String test = sc.nextLine();
        
        System.out.println("Do you want to make everything lower case?");
        String ans = sc.nextLine();
        String lowerans = ans.toLowerCase();
        if(lowerans.equals("yes")){
            test = test.toLowerCase();
            System.out.println(test);
        } 
        
        System.out.println("Do you want to remove all punctuation?");
        String ans2 = sc.nextLine();
        String lowerans2 = ans2.toLowerCase();
        if(lowerans2.equals("yes")){
         test = encoder.removePunctuation(test);
         System.out.println(test); 
        } 
       
        
        String secretcode = encoder.secretcode(test);
        System.out.println(secretcode);
        
        System.out.println("Do you want to convert the secret code into a secret message?");
        String yn = sc.nextLine();
        if(yn.toLowerCase().equals("yes")){
          System.out.println(encoder.secretmessage(secretcode));
        } else {
            System.out.println("Ok, you do not want the message");
        }
        
   }
}
