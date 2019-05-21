package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getPerimeter(){
        return side *4;
    }

    @Override
    public int getArea(){
        System.out.println("did this shit work?");
        return side * side;
    }
}
