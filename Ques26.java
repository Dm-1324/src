class Calculator{
    public int addNum(int a,int b){
        return a+b;
    }
    public double addNum(double a,double b){
        return a+b;
    }
}


public class Ques26 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int a = c1.addNum(2,3);
        double b = c1.addNum(4.0,3.0);
        System.out.println(a);
        System.out.println(b);

    }
}
