abstract class Furniture{
    public void getName(){
        System.out.println("The shop name is ABCD");
    }
    public abstract void sell();
}
class Chair extends Furniture{
    public void sell(){
        System.out.println("We sell chairs here !!!!");
    }
}


public class Ques31 {
    public static void main(String[] args) {
        Furniture f1 = new Chair();
        f1.sell();
    }
}
