class Myclass{
    static int variable = 25;
    int instvariable = 30;

    public static void staticMethod(){
        System.out.println("Static method called,static variable: "+variable);
    }
    public void instanceMethod(){
        System.out.println("This can call both static and instance variable");
        System.out.println("Static variable: "+variable);
        System.out.println("Instance variable: "+instvariable);
    }
}


public class Ques36 {
    public static void main(String[] args) {
        Myclass.staticMethod();
        Myclass class1 = new Myclass();
        class1.instanceMethod();
    }
}
