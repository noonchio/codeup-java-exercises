package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


public double getArea(){
    return length * width;
}

public double getPerimeter(){
    return (2 * length) + (2 * width);
}

public Rectangle(double length, double width){
    super(length, width);
}

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }




/*
    protected int length;

    protected int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(){}

    public Rectangle(int length,  int width) {
        this.length = length;
        this.width = width;
//        System.out.println("HI THERE");
    }

    public int getArea(){
return length * width;
    }

    public int getPerimeter(){
return (2 * length) + (2 * width);
    }
*/





}
