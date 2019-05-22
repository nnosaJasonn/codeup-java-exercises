package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        super.length = side;
    }
    @Override
    public void setWidth(double side) {
        super.width = side;
    }
    @Override
    public double getPerimeter() {
        return super.length * 4;
    }
    @Override
    public double getArea() {
        return super.width * super.length;
    }


    //    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        /*this.side = side;*/
//    }

    /*@Override
    public double getPerimeter(){
        return side *4;
    }

    @Override
    public double getArea(){
        return side * side;
    }*/
}
