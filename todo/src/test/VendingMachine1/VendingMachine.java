package test.VendingMachine1;

public class VendingMachine {
    
    private boolean isPushedButton;
    private int coins;

    public void pushButton(){
        this.isPushedButton = true;
    }

    public boolean waitForPushBotton() {
        return this.isPushedButton;
    }

    public String getBevarage() {
        if(isPushedButton){
            return "コーラ";
        } else {
            return "";
        }
    }

    public int getCoins() {
        return this.coins;
    }

    public void setCoins(int i) {
        this.coins = i;
    }
}
