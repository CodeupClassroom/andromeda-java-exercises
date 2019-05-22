package shapes;

public class Rectangle {

    protected double width;
    protected double length;
    int numberOfSides = 4;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

}
