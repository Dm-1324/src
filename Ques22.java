class BankAccount{
    int Balance;

    public BankAccount(int initialBalance){
        this.Balance = initialBalance;
        System.out.println("Account initialized, balance is: "+Balance);
    }
    public void deposit(int amount){
        if(amount>0){
            Balance = Balance+amount;
            System.out.println("Deposited: "+amount+" new balance: "+Balance);
        }
        else{
            System.out.println("Invalid deposit amount!!!");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && Balance>=amount){
            Balance = Balance-amount;
            System.out.println("Withdrew: "+amount+" new balance is "+Balance);
        }
        else if(amount<=0){
            System.out.println("Invalid withdrawal amount!!");
        }
        else{
            System.out.println("Insufficient Balance: "+Balance+",Please withdraw a smaller amount");
        }
    }
}


public class Ques22 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(2500);
        b1.deposit(1500);
        b1.withdraw(4500);
    }
}
