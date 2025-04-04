class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class MethodOverloadingExample4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));           
        System.out.println(calc.add(5, 10, 15));       
        System.out.println(calc.add(5.5, 10.5));       
        System.out.println(calc.add(new int[]{1, 2, 3, 4, 5})); 
    }
}
