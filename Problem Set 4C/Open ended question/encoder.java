
/**
 * Write a description of class myprogram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class encoder
{
    public static String secretcode (String input){
        String totalval = "";
        int randomval = (int) (Math.random()*9) + 1;
        for(int i = 0; i < input.length(); i++){
            char charact = input.charAt(i);
            int ascii = charact ;
            ascii += randomval;
            totalval += ascii;
            totalval += " ";
        }
        return totalval;
    }
    
        public static String secretmessage(String input) {
        String encodedmessage = "";
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
            int ascii = Integer.parseInt(temp);
                encodedmessage += (char) ascii;
            temp = "";
        } else {
            temp += currentChar;
        }
    }

    return encodedmessage;
}


    public static String removePunctuation(String word) {
        String blank = "";

        for (int i = 0; i < word.length(); i++) {
            char currentchar = word.charAt(i);
        
            if (Character.isAlphabetic(currentchar) || currentchar == ' ') {
                blank += currentchar;
            }
        }

        return blank;
    }   
}
