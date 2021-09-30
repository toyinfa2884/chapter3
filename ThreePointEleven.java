package chapterThree;

public class ThreePointEleven {

    private double balance;
    private double deposit;
    private double withdraw;

    public void deposit(double mybBalance) {
        balance = mybBalance + deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double myNewBalance, double vat, int pin) {
        if(pin == 2345)
        balance = myNewBalance - withdraw - vat;
        else{
            System.out.println("Your pin is not correct");
        }
        if(withdraw < balance)
            System.out.println("Withdraw amount exceed account balance.");

    }
}
