package ro.ase.acs.chain;

public class CEO extends CallCenterHandler {
    //TO DO: de refacut metoda pentru a trata NULLPOINTEREXCEPTION
    @Override
    public boolean refund(double sum) {
        System.out.println("Refund was handled by the CEO.");
        return true;
    }
}
