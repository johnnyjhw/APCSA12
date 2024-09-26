
import java.util.Scanner;

class Driver {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringTools sTools = new StringTools();

    System.out.println("lastLetter test cases: ");
    System.out.println("Enter a word with at least one character: ");
    String answer1 = input.nextLine();
    System.out.println("The last letter is " + sTools.lastletter(answer1));
    System.out.println("---------------------");

    System.out.println("Phone number format: ");
    System.out.println("Enter a phone number: ");
    String answer2 = input.nextLine();
    System.out.println("Phone number format: " + sTools.formatPhoneNumber(answer2));
    System.out.println("---------------------");
    
    System.out.println("Middle Three Numbers: ");
    System.out.println("Enter a word: ");
    String answer3 = input.nextLine();
    System.out.println("The middle three are: " + sTools.middleThree(answer3));
    System.out.println("---------------------");
    
    System.out.println("Swap last two numbers: ");
    System.out.println("Enter a word: ");
    String answer4 = input.nextLine();
    System.out.println("The last two letters swapped is: " + sTools.swapLastTwo(answer4));
    System.out.println("---------------------");
    
    System.out.println("True or false: ");
    System.out.println("Enter a word: ");
    String answer5 = input.nextLine();
    int answerint = input.nextInt();
    System.out.println("The result: " + sTools.frontAgain(answer5, answerint));
    
   }
}
