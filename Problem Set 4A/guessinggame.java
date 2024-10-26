
import java.util.Scanner;
public class guessinggame
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int randomnum = (int) (Math.random() * 100) + 1;
        int counter = 0;
        int answer = 0;

        
        while(answer != randomnum){
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        System.out.println("Your guess: ");
        answer = sc.nextInt();
        counter ++;
        if (answer == randomnum){
            System.out.println("You guessed it! It took you " + counter + " tries.");
        } else if (answer > randomnum){
            System.out.println("Nope, that guess is too high");
        } else if (answer < randomnum){
            System.out.println("Nope, that guess is too low");
        }
    }
        
    }
}
