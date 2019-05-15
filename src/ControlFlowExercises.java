import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
     /*   int i = 5;
        while (i<=15){
            System.out.println(i);
            i++;
        }*/
     for (int i = 5; i<=15; i++){
         System.out.println(i);
     }

      /*  int j = 0;
        do{
            System.out.println(j);
            j +=2;
        }while(j<= 100);*/

      for (int j = 0; j<=100; j+=2){
          System.out.println(j);
      }

       /* long k = 2;
        do{
            System.out.println(k);
            k *= k;
        } while (k <= 1000000);*/
       for (long k = 2; k<=1000000; k*=k){
           System.out.println(k);
       }

       for (int i = 1; i<100; i++){
           if (i % 15 == 0){
               System.out.println("FizzBuzz!");
           } else if (i %5 == 0){
               System.out.println("Buzz!");
           } else if (i%3 ==0){
               System.out.println("Fizz!");
           } else{
               System.out.println(i);
           }
       }

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String answer = sc.nextLine();
        System.out.println("what number would you like to go to?");
        int stop = sc.nextInt();


            String numTable = "number  | squared| cubed \n------- | ------ | ------";
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("here is your table! \n");
                System.out.printf(numTable + "%n");

                for (int i = 1; i <= stop; i++) {
                    double square = Math.pow(i, 2);
                    double cube = Math.pow(i, 3);
                    if (i < 10) {
                        System.out.printf("%d\t\t|%.0f\t\t |%.0f%n", i, square, cube);
                    } else {
                        System.out.printf("%d\t\t|%.0f\t |%.0f%n", i, square, cube);
                    }
                }
            }

            boolean moreGrades = true;

        do {
            System.out.println("Enter a grade and receive your letter grade!");
            int grade = sc.nextInt();
            if (grade < 60) {
                System.out.printf("Your grade is %d, you got an F%n", grade);
            } else if (grade >= 90) {
                System.out.printf("Your grade is %d, you got an A%n", grade);
            } else if ((grade >= 80) && (grade < 90)) {
                System.out.printf("Your grade is %d, you got a B%n", grade);
            } else if ((grade >= 70) && (grade < 80)) {
                System.out.printf("Your grade is %d, you got a C%n", grade);
            } else if ((grade >= 60) && (grade < 70)) {
                System.out.printf("Your grade is %d, you got a D%n", grade);
            } else {
                System.out.println("Does not compute");
            }
            System.out.println("Would you like to continue? yes/no");
            String respond = sc.next();
            if (!respond.equals("yes")){
                moreGrades = false;
            }
        } while(moreGrades);
        System.out.println("farewell");
    }
}
