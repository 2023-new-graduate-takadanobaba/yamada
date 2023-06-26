package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class test {

    public boolean isPushedButton;

    @BeforeEach
    public void setup(){
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

}
