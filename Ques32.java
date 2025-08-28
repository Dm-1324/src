interface Calc1 {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class MyCalculator implements Calc1 {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
}


public class Ques32 {
    public static void main(String[] args) {
        Calc1 cal1 = new MyCalculator();
        double sum = cal1.add(3.0,3.0);
        double diff = cal1.subtract(4.0,3.0);
        double mult = cal1.multiply(3.0,3.0);
        double div = cal1.divide(30.0,3.0);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
    }
}
