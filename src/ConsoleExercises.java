        import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        scanner = scanner.useDelimiter("\n");
       /* System.out.print("\n Enter an integer ");
        int userInt = scanner.nextInt();
        System.out.println(userInt);
        scanner.nextLine();
        System.out.print("enter three words: ");
        String wordOne = scanner.nextLine();
        String wordTwo = scanner.nextLine();
        String wordThree = scanner.nextLine();
        System.out.println(wordOne + "\n" + wordTwo + "\n" + wordThree);
        System.out.print("enter the length, width, and height of the room: ");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float area = length * width;
        float perimeter = (length * 2) + (width * 2);
        float volume = length * width * height;
        System.out.printf("the area of the classroom is %f feet squared, the perimeter is %f feet, and the volume of the classroom is %f", area, perimeter, volume);*/
        System.out.println("Enter your hero's name: ");

        String heroName = scanner.nextLine();

        System.out.printf("Your name is %S %n", heroName);

        System.out.println("are you ready to start? yes/no");

        String ready = scanner.next();

        boolean confirmation = ready.equals("yes");

        int health = 5;
        int attackPoints = 6;

        String rival = "James Lipton";
        int rivalHealth = 40;
        int rivalAttackPoints = 2;

        if(confirmation){
            System.out.printf("you have %d health and %d attack points \n ===================%n", health, attackPoints);
        } else {
            System.out.println("all pacifists will be executed");
        }

        System.out.printf("A rival gang member, %s has appeared! \n Health: %d \n Attack Points: %d %n", rival, rivalHealth, rivalAttackPoints);

        System.out.println("Choose 1, 2, or 3: \n 1. Attack \n 2. Drink Potion \n 3. Run like a bitch");
       do {
           String rivalResponse = "%s has attacked! you've sustained %d damage.. \n your health is now: %d \n Choose 1, 2, or 3: \n 1. Attack \n 2. Drink Potion \n 3. Run like a bitch";

           int action = scanner.nextInt();
            if (action == 1) {
                rivalHealth -= attackPoints;
                health -= rivalAttackPoints;
                System.out.printf("Hit! %s's health is now at %d %n", rival, rivalHealth);
                System.out.printf(rivalResponse, rival, attackPoints, health);
            } else if (action == 2) {
                if (health < 37) {
                    health += 50;
                    health -= rivalAttackPoints;
                    System.out.printf("you drank potion! \n your health is now: %d%n", health);
                    System.out.printf(rivalResponse, rival, attackPoints, health);
                } else {
                    health -= rivalAttackPoints;
                    System.out.printf("Your health is already full!%n");
                    System.out.printf(rivalResponse, rival, attackPoints, health);              }
            } else {
                health = 0;
                health -= rivalAttackPoints;
                System.out.printf("%s has killed you because you can never run from %s%n", rival, rival);
                System.out.printf(rivalResponse, rival, attackPoints, health);            }
        }  while ((rivalHealth > 0) && (health > 0));
    }
}
