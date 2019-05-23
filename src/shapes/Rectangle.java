package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    //
//    protected double width;
//    protected double length;
//    int numberOfSides = 4;
//
    public Rectangle(double length, double width) {
        super(length, width);
//        this.length = length;
//        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

//    Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
    // because Quadrilateral.getPerimeter is abstract, so it needs an implementation
}
