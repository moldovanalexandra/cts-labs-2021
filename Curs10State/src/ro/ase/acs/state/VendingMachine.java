package ro.ase.acs.state;

public class VendingMachine {
    private VendingMachineState state;
    private float amount;
    private float price;

    public VendingMachine(){
        state = new AcceptingMoneyState();
    }

    public void setState(VendingMachineState state){
        this.state = state;
    }

    public void inputMoney(float amount){
        this.amount = amount;
        if(amount < 1 || amount > 10){
            state = new RefusingMoneyState();
        }else{
            state = new ProductSelectionState();
        }
        state.doAction();
    }

    public void selectProduct(float amount){
        this.price = price;
        if(amount >= price){
            state = new DeliveringProductState();
            this.amount -= price;
        }else{
            state = new RefusingMoneyState();
        }
        state.doAction();
        state = new AcceptingMoneyState();
        state.doAction();
    }



}
