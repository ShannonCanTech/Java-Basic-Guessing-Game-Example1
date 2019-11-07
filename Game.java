package shannonfoster.dev;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        /*
         * Guessing Game
         * User will input a number
         * Game will determine whether the guess is correct or not
         * */

        Random randNumber = new Random();
        int num;
        String answer;
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        do{
            num = randNumber.nextInt(10);
            System.out.println("Guess a number 1-10: ");
            int guess = scan.nextInt();
            //System.out.close();
            if(guess == num){
                System.out.printf("\nCongratulations! %d was the correct guess", guess);
                done = true;
            } else{
                System.out.printf("Sorry. %d was an incorrect guess.", guess);
                System.out.println("\nGuess again? (Y/N)");
                answer = scan.next();
                if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
                    done = true;
                } else{
                    continue;
                }
            }
        } while (!done);
    }
}
