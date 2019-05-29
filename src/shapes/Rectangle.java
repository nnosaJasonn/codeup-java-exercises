package shapes;

public class Rectangle extends Quadrilateral{


    public Rectangle(double length, double width) {
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
        return length * width;
    }

    //    protected double length;
//    protected double width;
//
//    public double getArea(){
//        return length * width;
//    }
//    public double getPerimeter(){
//        return 2 * length + 2* width;
//    }
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
}
