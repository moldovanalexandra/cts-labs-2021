package ro.ase.acs.main;

import ro.ase.acs.chain.CallCenterHandler;
import ro.ase.acs.chain.CallCenterManager;
import ro.ase.acs.chain.CallCenterOperator;
import ro.ase.acs.chain.SaleManager;

//DE LUAT IN VEDERE:
//---DE FACUT CLASA ABSRACTA
//---SA TRATAM CAZUL DACA SUCCESORU E NULL -> NU POT APELA NEXT CA NULL POINTER EXCEPTION
//---CEL PUTIN 2 VERIGI
//---ORIDINEA CONTEAZA!


public class Main {

    public static void main(String[] args) {
        CallCenterHandler operator = new CallCenterOperator();
        CallCenterHandler callCenterManager = new CallCenterManager();
        CallCenterHandler salesManager = new SaleManager();

        operator.setNextHandler(callCenterManager);
        //callCenterManager.setNextHandler(salesManager);

        operator.refund(60);
        operator.refund(160);
        operator.refund(1200);
        operator.refund(7000);
    }
}
