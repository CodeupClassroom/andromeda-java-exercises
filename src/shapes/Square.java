package shapes;

public class Square extends Quadrilateral {
    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea(){
        return Math.pow(super.length, 2);
    }

//    @Override
//    public double getPerimeter(){
//        return 4 * super.width;
//    }
}