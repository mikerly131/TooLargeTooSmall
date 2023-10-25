/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //variables for the game
        int guess = 0;
        int selectedNumber;
        int dupeCheck;
        int max = 100;
        int min = 1;
        int choices = max - min + 1;   //(Source: https://www.geeksforgeeks.org/java-math-random-method-examples)
        int guesses = 0;
        boolean guessStatus = false;
        Scanner in = new Scanner(System.in);

        // Conditional:  Select a random number (Source: https://www.geeksforgeeks.org/java-math-random-method-examples)
        selectedNumber = (int)(Math.random() * choices) + min;
        // Test - System.out.println("Test: Selected number is " + selectedNumber);

        // Need to keep checking conditional until the selectedNumber is guess
        while (!guessStatus) {

            // Prompt user to enter a number.  Don't count repeat guesses.
            System.out.println("Guess a number");
            dupeCheck = guess;
            guess = in.nextInt();

            if (dupeCheck == guess && dupeCheck != 0) {
                System.out.println("Don't repeat numbers, guess again");
                break;
            }
            // Conditional: Compare guess to selectedNumber. Most efficient to see if smaller first?
            else if (guess < selectedNumber) {
                System.out.println("Too small, guess again");
                guesses++;
            } else if (guess == selectedNumber) {
                System.out.println("Great guess, that is right!");
                guessStatus = true;
            } else {
                System.out.println("Guess again, that was too large");
                guesses++;
            }
        }
        System.out.print(guesses + " before guessing correctly");
    }
}
