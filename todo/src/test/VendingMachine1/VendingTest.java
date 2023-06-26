package test.VendingMachine1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class VendingTest {

    public boolean isPushedButton;
    public String bevarage;
    public int remainingAmount;

    @BeforeEach
    public void setUp(){
        VendingMachine sut = new VendingMachine();
    }

    @Test
    public void ボタンを押せているかどうか(){
        //準備
        VendingMachine sut = new VendingMachine();
        //実行
        sut.pushButton();
        isPushedButton = sut.waitForPushBotton();
        //検証
        assertEquals(true,isPushedButton);
    }

    @Test
    public void ボタンを押せていないかどうか(){
        //準備
        VendingMachine sut = new VendingMachine();
        //実行
        isPushedButton = sut.waitForPushBotton();
        //検証
        assertEquals(false,isPushedButton);
    }

    @Test
    public void コーラと返す(){
        //準備
        VendingMachine sut = new VendingMachine();
        //実行
        sut.pushButton();
        bevarage = sut.getBevarage();
        //検証
        assertEquals("コーラ",bevarage);
    }

    @Test
    public void _100円投入したと分かる(){
        //準備
        VendingMachine sut = new VendingMachine();
        //実行
        sut.setCoins(100);
        remainingAmount = sut.getCoins();
        //検証
        assertEquals(100,remainingAmount);
    }

    @Test
    public void _100円投入していないと分かる(){
        //準備
        VendingMachine sut = new VendingMachine();
        //実行
        remainingAmount = sut.getCoins();
        //検証
        assertEquals(0,remainingAmount);
    }
}
