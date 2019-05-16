import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
       int number = randNum();
        Scanner sc = new Scanner(System.in);
       int userGuess = 0;
        while (userGuess > 100 || userGuess < 1) {
            System.out.println("I'm thinking of a number between one and 100... can you guess?");
            userGuess = sc.nextInt();
        }

        while (!checkAnswer(userGuess, number)){
            userGuess = sc.nextInt();
        }
        System.out.println("what a fun game!");




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
