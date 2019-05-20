import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
       int number = randNum();
        Scanner sc = new Scanner(System.in);
       int userGuess = 0;
       int guesses = 0;
       int guessLimit = 10;
        while (userGuess > 100 || userGuess < 1) {

            System.out.println("I'm thinking of a number between one and 100... can you guess?");
            userGuess = sc.nextInt();
            guesses += 1;
            guessLimit -=1;
            System.out.printf("You have %d guesses left %n", guessLimit);
        }
        while (!checkAnswer(userGuess, number)){
            userGuess = sc.nextInt();
            guesses += 1;
            guessLimit -=1;
            System.out.printf("You have %d guesses left %n", guessLimit);

            if (guessLimit <= 0){
                System.out.println("you've guessed too many times! \n * GAME OVER *");
                break;
            }
        }
        System.out.println("what a fun game!");
        System.out.printf("you guessed %d times", guesses);
    }
    public static int randNum(){
        double number = Math.floor(Math.random() * 100 + 1);
        return (int)number;
    }

    public static boolean checkAnswer(int x, int number){

           Scanner sc = new Scanner(System.in);
           if (x > number) {
               System.out.println("LOWER");
               System.out.println("Try Again!");
               return false;
           } else if (x < number) {
               System.out.println("HIGHER");
               System.out.println("Try Again!");
               return false;
           } else {
               System.out.println("GOOD GUESS!");
               return true;
           }

    }
}
