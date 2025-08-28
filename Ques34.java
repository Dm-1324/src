class Counter{
    private static int count = 0;

    Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}


public class Ques34 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        int a = c1.getCount();
        System.out.println(a);
        Counter c2 = new Counter();
        int b = c2.getCount();
        System.out.println(b);
    }
}
