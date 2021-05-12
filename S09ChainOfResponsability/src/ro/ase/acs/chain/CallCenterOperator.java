package ro.ase.acs.chain;

public class CallCenterOperator extends CallCenterHandler {
    @Override
    public boolean refund(double sum) {
        if(sum < 100){
            System.out.println("The refound was handled by the center operator");
            return true;
            //verific sa am "urmas"; in caz contrar, NullPointerException
        } else if(nextHandler != null){
            return nextHandler.refund(sum);
        }
        System.out.println("Refund not possible");
        return false;
    }
}
