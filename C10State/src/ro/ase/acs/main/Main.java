package ro.ase.acs.main;

import ro.ase.acs.state.VendingMachine;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(5);
        vendingMachine.selectProduct(3);
    }
}
