import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        System.out.println("Would you like to talk to Bob?");
        Scanner sc = new Scanner(System.in);
        String yes = sc.next();

        boolean confirmation = yes.equalsIgnoreCase("yes");

        if (confirmation){
            System.out.println("This is bob, he likes talking");
        } else{
            System.out.println("This is bob, he likes talking");
        }

        String converse;
        sc.useDelimiter("\n");
     do {
         converse = sc.next();

         if (converse.endsWith("!")) {
             System.out.println("Bob: Woah, chill out!");
         } else if (converse.endsWith("?")) {
             System.out.println("Bob: Sure.");
         } else if (converse.equalsIgnoreCase("")) {
             System.out.println("Bob: Fine. Be that way!");
         } else if (converse.toLowerCase().endsWith("stop")) {
             System.out.println("Bob: nice talking with you, have a good day!");
         } else {
             System.out.println("Bob: Whatever");
         }
     } while(!converse.contains("stop"));

    }
}
