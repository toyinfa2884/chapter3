package chapterThree;

import chapterThree.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
public void accountNameTest() {
        Account myAccount1 = new Account();
        Account myAccount2 = new Account();
        myAccount1.setName("ABDULKAREEM ABDULFATAI");
        myAccount2.setName("ABDULKAREEM ABDULGAFAR");
        assertEquals("ABDULKAREEM ABDULFATAI", myAccount1.getName());
        assertEquals("ABDULKAREEM ABDULGAFAR", myAccount2.getName());
        System.out.printf("Account1: %s%n", myAccount1.getName());
        System.out.printf("Account2: %s", myAccount2.getName());
    }

    @Test
    public void accountCanDeposit(){
        Account myAccount = new Account();
        myAccount.deposit(1000.00);
        myAccount.setBalance(1000.00);
        myAccount.setName("ABDULKAREEM");
        assertEquals(1000.00, myAccount.getBalance());
        System.out.printf( "%sbalance: $%.2f%n",  myAccount.getName(),
                myAccount.getBalance());
    }
    @Test
    public void accountCanWithdraw(){
        Account myAccount = new Account();
        myAccount.deposit(1000.00);
        myAccount.withdraw(500.00, 2884);
        assertEquals(500.00, myAccount.getBalance());
        System.out.printf("Balance: $%.2f", myAccount.getBalance());
    }
}