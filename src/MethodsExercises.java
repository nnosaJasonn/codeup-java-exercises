import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        /*Math Problems*/
        System.out.println(add(2, 3));
        System.out.println(subtract(55, 32));
        System.out.println(multiply(32, -2));
        System.out.println(divide(98, 2));
        System.out.println(mod(33, 5));
        System.out.println(timesNoTimes(5, 4));
        System.out.println(timesimesmess(5, 4));
        System.out.println(factorial(5));


        /*Range*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1-10");
        integerRange(1, 10);

        /*factorial*/

        System.out.println("would you like to see my factorials?");
        String seeFacs = sc.next();
        if (seeFacs.equalsIgnoreCase("yes")) {
            do {
                System.out.println("Enter a number between 1 and 20");
                System.out.println("you're factorial is: " + factorial(integerRange(1, 20)) + "\n");
                System.out.println("would you like to see another factorial?");
                seeFacs = sc.next();
            } while (seeFacs.equalsIgnoreCase("yes"));
        } else {
            System.out.println("goodbye");
        }


            /*Dice*/
            System.out.println("How many sides are on your dice?");
            int diceSides = sc.nextInt();

            System.out.println("Type 'roll' to roll the dice");

            String roll = sc.next();
            dice(diceSides);

            System.out.println("would you like to roll again?");
            String confirm = sc.next();
            while (confirm.equalsIgnoreCase("yes")) {
                System.out.println("\nwould you like to roll again?");
                confirm = sc.next();
                dice(diceSides);
            }
            System.out.println("Goodbye");


    }
    public static int add(int x, int y){
        int added = x + y;
        return added;
    }
    public static int subtract(int x, int y){
        int subtracted = x - y;
        return subtracted;
    }
    public static int multiply(int x, int y){
        int multiplied = x * y;
        return multiplied;
    }
    public static int divide(int x, int y){
        int divided = x / y;
        return divided;
    }
    public static int mod (int x, int y){
        int modResult = x % y;
        return modResult;
    }
    public static int timesNoTimes (int x, int y){
      int total = 0;
        while (y > 0){
            total += x;
          y--;
        }
        return total;
    }
    public static int timesimesmess(int x, int y){
        if (y == 0){
            return 0;
        }
        return x + timesimesmess(x, y-1);
    }

    public static long factorial (int x){
        if (x == 0){
            return 1;
        }
        return x * factorial (x-1);
    }

    public static void dice (int x){
        double diceOne = Math.floor(Math.random() * x + 1);
        double diceTwo = Math.floor(Math.random() * x + 1);
        System.out.printf("you rolled two %d sided dice, the first one rolled a %.0f, the second one rolled a %.0f %n", x, diceOne, diceTwo);
    }
    public static int integerRange (int x, int y){
        Scanner sc = new Scanner(System.in);
        int numInput = sc.nextInt();
        while(numInput < x || numInput > y){
            System.out.printf("%d is not within range! %n", numInput);
            System.out.printf("please enter a number between %d and %d %n", x, y);
            numInput = sc.nextInt();
        }
        System.out.printf("%d is a wonderful number between %d and %d %n", numInput, x, y);
        return numInput;
    }

}
