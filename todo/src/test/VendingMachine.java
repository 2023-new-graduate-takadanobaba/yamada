package test;

public class VendingMachine {
    
    private boolean isPushedButton;

    public void pushButton(){
        isPushedButton = true;
    }

    public boolean waitForPushBotton() {
        return isPushedButton;
    }
}
