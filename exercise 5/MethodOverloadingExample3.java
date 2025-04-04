class Printer {
    void print(String message) {
        System.out.println("Text Message: " + message);
    }

    void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(double value) {
        System.out.println("Decimal: " + value);
    }

    void print(boolean flag) {
        System.out.println("Boolean Value: " + flag);
    }
}

public class MethodOverloadingExample3 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello, Bangaram!");
        printer.print(100);
        printer.print(3.14159);
        printer.print(true);
    }
}
