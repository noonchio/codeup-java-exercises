package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

              Measurable myShape;

              Rectangle box3 = new Rectangle(2,4);

              myShape = box3;

              Measurable anotherShape;

              Square box4 = new Square(2);

              anotherShape = box4;

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(anotherShape.getArea());
    }

}
