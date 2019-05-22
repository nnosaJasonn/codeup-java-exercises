package shapes;

public class ShapesTest {
        static Measurable myShape;
    public static void main(String[] args) {

        Measurable myShape2 = new Square(6);


        Square square = new Square(5);
        Rectangle rect = new Rectangle(6, 9);


        myShape = square;
        System.out.println("myShape.getArea()square = " + myShape.getArea());

        System.out.println("myShape.getPerimeter()square = " + myShape.getPerimeter());

        myShape = rect;
        System.out.println("\nmyShape.getArea()rect = " + myShape.getArea());

        System.out.println("myShape.getPerimeter()rect = " + myShape.getPerimeter());
        

        Measurable parallel = new Parallelogram(17, 5);
        System.out.println("\nparallel.getPerimeter() = " + parallel.getPerimeter());

        System.out.println("parallel.getArea() = " + parallel.getArea());


/*
        Rectangle() box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        shapes.Quadrilateral box2 = new Square(5);
        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
        System.out.println("box2 = " + box2.getArea());*/
    }
}
