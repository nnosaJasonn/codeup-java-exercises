package shapes;

public class Parallelogram extends Quadrilateral implements Measurable {

    public Parallelogram(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);

    }

    @Override
    public double getArea() {
       double base;
       double other;
        if (length<width){
            base = width;
            other = length;
        } else {
            base = length;
            other = width;
        }
        double height = Math.sqrt((Math.pow(base, 2) - Math.pow(other, 2)));

        return base * height;
    }
}
