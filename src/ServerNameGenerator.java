import java.util.Arrays;

public class ServerNameGenerator {
    public static String[] adjArr = {"crabby", "habitual", "unruly", "assorted", "enchanted", "picayune", "endurable", "aquatic", "insidious", "miscreant"};
    public static String[] nounArr = {"cup", "estate", "thought", "delivery", "membership", "power", "leadership", "computer", "quinoa", "ayahuasca"};
    public static void main(String[] args) {
        System.out.println("here is your server name:\n" + randomElement(adjArr) + "-" + randomElement(nounArr));
    }
    public static String randomElement(String[] arr){
        int randomNum = (int)Math.round(Math.floor(Math.random() * 10 + 1));
        return arr[randomNum];
    }
}
