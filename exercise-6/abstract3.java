abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    double calculateArea() {
        return side * side; 
    }
}
public class abstract3 {
    public static void main(String[] args) {
        Shape square = new Square(4.0);
        System.out.println("Area of the square: " + square.calculateArea());
    }
}
