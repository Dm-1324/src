class Rectangle{
    int length;
    int width;

    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    Rectangle(int side){
        this.length = side;
        this.width = side;
    }
    public void getArea(){
        System.out.println(length*width);
    }
    public void getPerimeter(){
        System.out.println(2*(length+width));
    }
}



public class Ques23 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5);

        r1.getArea();
        r1.getPerimeter();
        r2.getArea();
        r2.getPerimeter();
    }
}
