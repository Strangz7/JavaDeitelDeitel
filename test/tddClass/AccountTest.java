package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        Account steve = new Account();
        steve.deposit(500);
        assertEquals(500,steve.getBalance());
    }
    @Test
    public void depositTwiceTest(){
        Account steve = new Account();
        steve.deposit(500);
        steve.deposit(300);
        assertEquals(800,steve.getBalance());

    }
    @Test
    public void negativeDepositTest(){
        Account steve = new Account();
        steve.deposit(500);
        steve.deposit(-500);
        steve.deposit(500);
        assertEquals(1000,steve.getBalance());

    }
    @Test
    public void withdrawalTest(){
        Account steve = new Account();
        steve.deposit(500);
        steve.withdraw(200);
        assertEquals(300,steve.getBalance());

    }
    @Test
    public void testThatYouCannotWithdrawMoreThanWhatYouHave(){
        Account steve = new Account();
        steve.deposit(500);
        steve.withdraw(700);
        assertEquals(500,steve.getBalance());

    }


}
