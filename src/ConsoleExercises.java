        import java.util.Scanner;
        import java.util.Random;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
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

       /*Start Game*/
        System.out.println("Enter your hero's name: ");

        String heroName = scanner.nextLine();

        System.out.printf("Your name is %S %n", heroName);

        System.out.println("are you ready to start? yes/no");

        String ready = scanner.next();

        boolean confirmation = ready.equals("yes");
        boolean condition = true;
            double health = 30;

            double attackPoints = 7;
        do {

            /*User Stats*/
            double startingHealth = health;

            /*Rival Info*/
            String[] arr = {"Ronald Mcdonald", "Kim Jong Un", "Jar Jar Binks", "Michael Jordan", "Zombie Michael Jackson", "James Lipton", "DJ Khaled"};
            Random random = new Random();
            int randomRival = random.nextInt(arr.length);
            String rival=arr[randomRival];
            double rivalHealth = Math.floor(Math.random() * 50 + 1);
            double rivalAttackPoints = Math.floor(Math.random() * 10 + 1);
            double rivalPotions = Math.floor(Math.random() *6 +1);

            /*Starting Messages*/

            if (confirmation) {
                System.out.printf("you have %.0f health and %.0f attack points \n ===================%n", health, attackPoints);
            } else {
                System.out.println("all pacifists will be executed");
            }

            System.out.printf("A rival gang member, %s has appeared! \n==========================\n %s Stats: \n \tHealth: %.0f \n \tAttack Points: %.0f %n \tPotions: %.0f %n \n", rival, rival, rivalHealth, rivalAttackPoints, rivalPotions);

            System.out.println("Choose 1, 2, or 3: \n 1. Attack \n 2. Drink Potion \n 3. Run!\n");

            /*Actual Game*/

            do {
                String rivalResponse = "%s %s! You've sustained %.0f damage.. \n Your health is now: %.0f \n Choose 1, 2, or 3: \n 1. Attack \n 2. Drink Potion \n 3. Run!\n";
                String rivalAction = "attacks";
                int action = scanner.nextInt();
                if (rivalHealth <= 10){

                    rivalAction = "drinks a potion and regains 3 health";
                    rivalHealth += 3;
                } else if (rivalHealth <= 0){
                    rivalHealth = 0;
                    System.out.println("you win!");
                } else {
                    rivalAction = "attacks";
                }
                /*If you get killed*/

                if (health <= 0) {
                    health = 0;
                    System.out.println("%s has killed you! %n \n * Game Over *\n");
                }

                if (action == 1) {
                /*Attack*/

                    rivalHealth -= attackPoints;
                    health -= rivalAttackPoints;
                    System.out.printf("Hit! %s's health is now at %.0f %n\n", rival, rivalHealth);
                    System.out.printf(rivalResponse, rival, rivalAction, rivalAttackPoints, health);

                    System.out.println(" ");
                } else if (action == 2) {
                    /*Drink Potion*/

                    if (health < startingHealth) {
                        health += 6;
                        System.out.printf("you drank potion! \n your health is now: %.0f%n", health);
                        health -= rivalAttackPoints;
                        System.out.printf(rivalResponse, rival, rivalAction, rivalAttackPoints, health);
                    } else {

                        health -= rivalAttackPoints;
                        System.out.printf("Your health is already full!%n");
                        System.out.printf(rivalResponse, rival, rivalAction, attackPoints, health);
                    }
                } else if (action == 3){
                    /*Run Away*/

                    health = 0;
                    System.out.printf("You can never run from %s... %n %s Health: %s %n \n* GAME OVER *\n", rival, heroName, health);
                } else {
                    /*Cheat To Win*/

                    rivalHealth = 0;
                    System.out.printf("%s was struck by lightning.  you win! %n \n * GAME OVER * \n", rival);
                }
            } while ((rivalHealth > 0) && (health > 0));
            System.out.println("would you like to play again? yes/no");
            String confirm = scanner.next();
            boolean cont = confirm.equals("yes");
            if (!cont){
                condition = false;
            } else {
                condition = true;

                System.out.println("Congratulations on your victory! Please choose your prize! \n 1. Add attack points \n 2. Add Health \n 3. Drink a cold brewski with the boys");
                double addAttackPoints = Math.floor(Math.random() *4 + 1);
                double addHealth = Math.floor(Math.random() *10 + 1);
                String drinkBeer = "You drink a nice cold brewksi with tha boys %n";
                int treasureChest = scanner.nextInt();
                if (treasureChest == 1) {
                    attackPoints += addAttackPoints;
                    System.out.printf("You have chosen to add Attack Points to your character. You now have %.0f!%n", attackPoints);
                } else if (treasureChest == 2){
                    health += addHealth;
                    System.out.printf("You have chosen to add Health to your character. You now have %.0f%n", health);
                } else {
                    System.out.printf(drinkBeer);
                }
            }
        } while (condition);

    }
}
