package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account2Test {

    @Test
    public void depositTest(){
        Account2 steven = new Account2();
        steven.deposit(500);
        assertEquals(500,steven.getBalance());
}
    @Test
    public void depositTwiceTest(){
        Account2 steven = new Account2();
        steven.deposit(500);
        steven.deposit(500);
        assertEquals(1000,steven.getBalance());

    }
    @Test
    public void testForNegativeDeposit(){
        Account2 steven = new Account2();
        steven.deposit(-200);
        assertEquals(0,steven.getBalance());
    }
    @Test
    public void testForWithdrawal(){
        Account2 steven = new Account2();
        steven.deposit(1000);
        steven.withdraw(500);
        assertEquals(500,steven.getBalance());
    }
    @Test
    public void testForDoubleWithdrawal(){
        Account2 steven = new Account2();
        steven.deposit(1000);
        steven.withdraw(500);
        steven.withdraw(400);
        assertEquals(100,steven.getBalance());

    }
    @Test
    public void testForNegativeWithdrawal(){
        Account2 steven = new Account2();
        steven.deposit(5000);
        steven.withdraw(-500);
        assertEquals(5000,steven.getBalance());

    }
    @Test
    public void testForEmptyWithdraw(){
        Account2 steven = new Account2();
        steven.deposit(0);
        steven.withdraw(500);
        assertEquals(0,steven.getBalance());

    }
    @Test
    public void testForTransfer(){
        Account2 steven = new Account2();
        steven.deposit(2000);
        assertEquals(2000,steven.getBalance());
        Account2 amaka = new Account2();
        assertEquals(0,amaka.getBalance());
     //   steven.transfer (amaka,1000);
        assertEquals(1000,amaka.getBalance());
        assertEquals(1000,steven.getBalance());


    }
}

