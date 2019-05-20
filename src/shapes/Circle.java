package shapes;

public class Circle {

    private double radius;

     public Circle(double radius) {
        this.radius = radius;
    }

     double getArea(){
        double area = Math.PI * (radius * radius);
        System.out.printf("the area of a circle with a radius of %.4f is %.4f %n", radius, area);
        return area;
    }


     double getCircumference(){
        double circ = 2 * (Math.PI * radius);
        System.out.printf("The circumference of a circle with a radius of %.4f is %.4f %n",radius, circ);
        return circ;
    }

}
