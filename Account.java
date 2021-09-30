package chapterThree;

public class Account {
    private  String name;
    private  double balance;

    public Account(){
        if(balance > 0.0)
            this.balance = balance;

    }

    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }
   public void setBalance(double balance){

        this.balance = balance;
        }
    public double getBalance(){

        return balance;
    }

    public void deposit(double deposit) {
            balance = balance + deposit;
    }

    public void withdraw(double withdraw, int pin) {

        if(pin == 2884)
            balance = balance - withdraw;
    }
}
