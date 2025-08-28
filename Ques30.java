interface Payment{
    void pay(int amount);
    void refund(int amount);
}
class CreditCardPayment implements Payment{
    public void pay(int amount) {
        System.out.println("Paying " + amount + " via Credit Card.");
    }

    public void refund(int amount) {
        System.out.println("Refunding " + amount + " to Credit Card.");
    }
}
class UPIPayment implements Payment{
    public void pay(int amount) {
        System.out.println("Paying " + amount + " via UPI.");
    }

    public void refund(int amount) {
        System.out.println("Refunding " + amount + " to UPI.");
    }
}

public class Ques30 {
    public static void main(String[] args) {
        Payment pay;
        pay = new CreditCardPayment();
        pay.pay(250);
        pay.refund(120);

        pay = new UPIPayment();
        pay.pay(400);
        pay.refund(20);


    }
}
