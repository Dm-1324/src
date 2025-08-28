abstract class Bank{
    public abstract double getInterestRates();
}
class SBI extends Bank{
    public double getInterestRates(){
        return 8.5;
    }
}
class HDFC extends Bank{
    public double getInterestRates(){
        return 11.5;
    }
}

public class Ques29 {
    public static void main(String[] args) {
        Bank account;
        account = new SBI();
        double interest1 = account.getInterestRates();
        System.out.println("The interest rate for SBI is "+interest1);

        account = new HDFC();
        double interest2 = account.getInterestRates();
        System.out.println("The interest rate for HDFC is "+interest2);
    }
}
