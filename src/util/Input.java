package util;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
/*String with prompt*/
    public  String getString(String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }
/*String without prompt*/
    public  String getString(){

        return getString("Enter a String");
    }

/*bool with prompt*/
    public  boolean yesNo(String prompt){
        System.out.println(prompt);
        sc.nextLine();
        String yVn = sc.nextLine();
        if (yVn.equalsIgnoreCase("y") || yVn.equalsIgnoreCase("yes")){
            return true;
        } else{
            return false;
        }
    }
/*bool without prompt*/
    public  boolean yesNo(){
        return yesNo("yes or no?");
    }

    /*int  min max with prompt*/
    public  int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int num = sc.nextInt();
        if(num < min || num > max){
            return getInt(min, max, prompt);
        } else {
            return num;
        }
    }
/*int min max  without prompt*/
    public  int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d", min, max);
        int num = sc.nextInt();
        if(num < min || num > max){
            return getInt(min, max);
        } else {
            return num;
        }
    }

    /*get int with prompt*/
    public  int getInt(String prompt){
        System.out.println(prompt);
        int num = sc.nextInt();
        return num;
    }
/*get int with no prompt*/
    public  int getInt(){
        return getInt("enter a number");
    }


    /*getDouble min max with prompt*/
    public  double getDouble(double min, double max,String prompt) {
        System.out.println(prompt);
        double num = sc.nextDouble();
        if (num < min || num > max) {
            return getDouble(min, max, prompt);
        } else {
            return num;
        }
    }


    /*getDouble min max without prompt*/
    public  double getDouble(double min, double max) {
        System.out.printf("Enter a double between %.0f and %.0f. %n", min, max);
        double num = sc.nextDouble();
        if (num < min || num > max) {
             return getDouble(min, max);
        } else {
            return num;
        }
    }

    /*get double without prompt*/
    public  double getDouble(){
        return getDouble("enter a double");
    }

    /*get double with prompt*/
    public  double getDouble(String prompt){
        System.out.println(prompt);
        double num = sc.nextDouble();
        return num;
    }

}
