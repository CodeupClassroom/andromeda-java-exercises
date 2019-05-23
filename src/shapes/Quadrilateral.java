package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }


//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }

    public abstract double getPerimeter();
    @Override
    public abstract double getArea() ;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
