package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account3 {
    @Test
    public void depositTest(){
        Bank steve = new Bank();
        steve.deposit(300);
        assertEquals(300,steve.getBalance());
    }
    @Test
    public void depositTwiceTest(){
        Bank steve = new Bank();
        steve.deposit(500);
        steve.deposit(500);
        assertEquals(1000,steve.getBalance());
    }
    @Test
    public void testForNegativeDeposit(){
        Bank steve = new Bank();
        steve.deposit(500);
        steve.deposit(-200);
        assertEquals(500,steve.getBalance());
    }
    @Test
    public void testForNegative(){
        Bank steve = new Bank();
        steve.deposit(-200);
        assertEquals(0,steve.getBalance());
    }
    @Test
    public void testForWithdrawal(){
        Bank steve = new Bank();
        steve.deposit(500);
        steve.withdraw(200);
        assertEquals(300,steve.getBalance());
    }
    @Test
    public void testForDoubleWithdraw(){
        Bank steve = new Bank();
        steve.deposit(1000);
        steve.withdraw(200);
        steve.withdraw(300);
        assertEquals(500,steve.getBalance());
    }
    @Test
    public void testForNegativeWithdrawal(){
        Bank steve = new Bank();
        steve.deposit(1000);
        steve.withdraw(1500);
        assertEquals(1000,steve.getBalance());
    }
    @Test
    public void testForEmptyBankWithdrawal(){
        Bank steve = new Bank();
        //steve.deposit(0);
        steve.withdraw(1000);
        assertEquals(0,steve.getBalance());
    }

}
