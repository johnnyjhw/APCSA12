
public class StringTools
{
   public String lastletter (String str) {
       return str.substring(str.length() - 1);
   }
   
   public String formatPhoneNumber(String str1) {
       return "(" + str1.substring(0, 3) + ")" + str1.substring(3, 6) + "-" + str1.substring(6,9);
   }
   
   public String middleThree(String str) {
       int midpoint = str.length() / 2;
       return str.substring(midpoint -1, midpoint +2);
   }
   
   public String swapLastTwo(String str) {
    return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
     }
     
    public boolean frontAgain (String str, int n) {
        return str.substring(0, n).equals(str.substring(str.length() - n));
    }
   }

