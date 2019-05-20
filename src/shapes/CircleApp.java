package shapes;
import util.Input;

public class CircleApp {
    private static int numOfCircles = 0;

    public static int addACircle(){
        return numOfCircles += 1;
    }
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("Enter a circle radius");
        Circle circle1 = new Circle(radius);
        addACircle();
        circle1.getArea();
        boolean moreCircles = input.yesNo("Do you want to make another circle?");

        while (moreCircles){
            radius = input.getDouble("enter a circle radius");
            Circle circle2 = new Circle(radius);
            circle2.getArea();
            circle2.getCircumference();
            addACircle();
            moreCircles = input.yesNo("Do you want to make another circle?");
        }
        System.out.printf("you've made %d circles", numOfCircles);
    }
}
