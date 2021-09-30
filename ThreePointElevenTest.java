package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreePointElevenTest {
    @Test
    public void accountCanDeposit(){
        //given that i have an account
        ThreePointEleven accountOne = new ThreePointEleven();

        //when
        accountOne.deposit(500);
        accountOne.getBalance();
        //assert
        assertEquals(500, accountOne.getBalance());

    }

    @Test
    public void accountCanWithdraw(){
        ThreePointEleven accountOne = new ThreePointEleven();
        accountOne.deposit(500.45);

        //when
        accountOne.withdraw(600.00, 20.23, 2345);
        accountOne.getBalance();
        //assert
        assertEquals(620.23, accountOne.getBalance());
    }

}