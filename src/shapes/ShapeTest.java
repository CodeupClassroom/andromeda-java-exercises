package shapes;

public class ShapeTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(0, 5);
//        System.out.println("getArea = " + box1.getArea());
//        System.out.println("getPerimeter = " + box1.getPerimeter());

//        Rectangle box2 = new Square(5);
//        System.out.println("getArea = " + box2.getArea());
//        System.out.println("getPerimeter = " + box2.getPerimeter());

        Measurable myShape;

        myShape = new Square(8.8);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape);
        ((Square) myShape).getWidth();

        myShape = new Rectangle(8.8, 9.9);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape);
        ((Rectangle) myShape).getLength();
    }

//    What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
    // there is a class cast
    // Measurable does not have getLength or getWidth, so we have to cast the object to some other class of thing

}
