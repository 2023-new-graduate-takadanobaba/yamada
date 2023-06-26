package test.VendingMachine2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine2 {

    private boolean isButtonPushed;

    private String[] itemName = {"コーラ","ウーロン茶"};
    private int[] itemPrice = {100,100};

    VendingMachine2(){

    }

    public boolean isButtonPushed() {
        return this.isButtonPushed;
    }

    public void selectButton(String string) {
        isButtonPushed = true;
        
    }
    
}
