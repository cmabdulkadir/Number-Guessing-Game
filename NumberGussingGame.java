import java.util.Random;
import java.util.Scanner;
public class NumberGussingGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // declaring a new rand (object) this is built in Random class in java
        Random rand = new Random();

        //create variable to hold our random number = generating the random number that takes a range
        //gives you a range of numbers starting at 1 ending at 100
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Enter your guess (1-100)");

        int playerGuess = scan.nextInt();

        if(playerGuess == randomNumber ){

            System.out.println("Correct! You Win");

        } else if (playerGuess > randomNumber) {
            System.out.println("Nope! The number is lower. Guess again");

        }else {
            System.out.println("Nope! The number is higher. Guess again");
        }


    }
}