/*
    A simple game that allows a user to guess a number.
*/

package challenges.programming_challenges.java.v_1_3;

import java.util.Random;
import java.util.Scanner;

public class HigherLower01v1 {

    public static void main(String[] args){

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        int number = r.nextInt(1001);
        boolean guessed = false;
        
        while (!guessed){ // Loops until the user guesses the correct number

            System.out.println("Guess a number between 1 and 1000!");
            String input = sc.nextLine();

            try {
                int guess = Integer.parseInt(input);
                System.out.println(guess == number ? "You won!" : guess < number ? "Too low!" : "Too high!");
                guessed = guess == number;
            }

            catch (NumberFormatException i){
                System.out.println("This is not a valid number!");
            }
        }

        sc.close();
    }
}
