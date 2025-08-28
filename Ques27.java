abstract class Shape{
    public abstract double area();
}
class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle1 extends Shape{
    double length;
    double width;

    Rectangle1(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length*width;
    }
}
class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    public double area(){
        return 0.5*base*height;
    }
}

public class Ques27 {
    public static void main(String[] args) {
        Shape s1;
        s1 = new Circle(3.0);
        double areaCircle = s1.area();
        System.out.println(areaCircle);

        s1 = new Rectangle1(8.0,4.0);
        double areaRect = s1.area();
        System.out.println(areaRect);

        s1 = new Triangle(6.0,4.0);
        double areaTri = s1.area();
        System.out.println(areaTri);
    }
}
