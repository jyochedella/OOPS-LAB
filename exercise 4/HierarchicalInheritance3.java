class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle...");
    }
}

public class HierarchicalInheritance3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.drawCircle();

        Rectangle r = new Rectangle();
        r.draw();
        r.drawRectangle();
    }
}
