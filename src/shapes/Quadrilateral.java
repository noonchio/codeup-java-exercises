package shapes;

abstract class Quadrilateral extends Shape {

    protected double length;

    protected double width;

    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double width);



    Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }



}


