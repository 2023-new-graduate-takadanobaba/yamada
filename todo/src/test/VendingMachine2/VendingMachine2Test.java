package test.VendingMachine2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class VendingMachine2Test {
    private boolean isButtonPushed;

    @BeforeEach
    public void setUp(){
        VendingMachine2 sut = new VendingMachine2();
    }

    @Test
    public void 飲み物ごとのボタンを押せているか分かる(){
        // Arrange
        VendingMachine2 sut = new VendingMachine2();
        // Act
        sut.selectButton("コーラ");
        isButtonPushed = sut.isButtonPushed();
        // Assert
        assertEquals(true,isButtonPushed);
    }
}
