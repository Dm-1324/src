class Singleton{
    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello from Singleton Class");
    }
}


public class Ques35 {
    public static void main(String[] args) {
        Singleton Singleton1 = Singleton.getInstance();
        Singleton1.showMessage();
        Singleton Singleton2 = Singleton.getInstance();

        if(Singleton1 == Singleton2){
            System.out.println("Both the instances are same.");
        }

    }
}
