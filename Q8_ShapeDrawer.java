abstract class ShapeDraw {
    public abstract void draw();
}

class CircleShape extends ShapeDraw {
    public void draw() { System.out.println("Drawing Circle"); }
}

class SquareShape extends ShapeDraw {
    public void draw() { System.out.println("Drawing Square"); }
}

class TriangleShape extends ShapeDraw {
    public void draw() { System.out.println("Drawing Triangle"); }
}

public class Q8_ShapeDrawer {
    public static void main(String[] args) {
        ShapeDraw[] shapes = { new CircleShape(), new SquareShape(), new TriangleShape() };
        for (ShapeDraw s : shapes) {
            s.draw();
        }
    }
}
