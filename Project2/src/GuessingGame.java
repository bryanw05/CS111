/**
 Name: Bryan Wong
 Description: Guessing Game! Randomly generate a number, then the user guess the number.
 Upon guessing the number, output if the user input is too high or too low, along with how many guesses.
 Once the number is guessed, exit the program. If the user input -1, exit the program as the user had given up.
 */

import java.util.Random;
import java.util.Scanner;        

public class GuessingGame {

    public static void main(String[] args) {
        int totalguess = 0, largerguess = 0, smallerguess = 0;
        
        
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        int value = rand.nextInt(32)+1;
               
        System.out.println("Guess a number between 1-100:");
        int n = reader.nextInt();
        
        while(n != -1){
            if(n < value){
                System.out.println("Your guess is smaller than the random, guess again:");
                smallerguess++;
                totalguess++;
                 n = reader.nextInt();
            }
            else if(n > value){
                System.out.println("Your guess is larger than the random, guess again:");
                largerguess++;
                totalguess++;
                n = reader.nextInt();
            }
            else if(n == value){
                System.out.println("You've guessed the correct number!");
                totalguess++;
                System.out.println("Total number of guesses: " + totalguess);
                System.out.println("Smaller Guess: " + smallerguess);
                System.out.println("Larger Guess: " + largerguess);
                break;
            }
        }//end while()
    }
}
