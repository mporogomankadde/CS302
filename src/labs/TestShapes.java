package labs;

import static labs.Shapes.showArea;

public class TestShapes {
    public static void main(String[] args) {
        Circle c1=new Circle(4);
        Rectangle r1= new Rectangle(4,3);

        showArea(c1);
        showArea(r1);
    }
}
