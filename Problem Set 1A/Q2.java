import java.util.Scanner;

public class Q2 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
                System.out.print("What is your favourite course? ");
		String course = sc.nextLine();
		System.out.print("What is your favourite show? ");
		String show = sc.nextLine();
		System.out.print("How many hours do you spend studying each day? ");
		int study = sc.nextInt();
		System.out.print("How many hours do you spend watching shows each day?  ");
		int showT = sc.nextInt();
		System.out.println();
		int total = study + showT;
		
		
		System.out.println("Summary:");
		System.out.println("Your favourite course is " + course);
		System.out.println("Your favourite show is " + show);
		System.out.println("You spend " + study + " studying each day.");
		System.out.println("You spend " + showT + " watching shows each day.");
		System.out.println("In total, you spend " + total + " studying and watching shows each day.");
            }
	}