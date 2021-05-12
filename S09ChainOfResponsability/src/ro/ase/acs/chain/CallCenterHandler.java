package ro.ase.acs.chain;

public abstract class CallCenterHandler {
    //referinta catre interfata intrucat angajatii mei deriveaza acesta clasa si in asa fel ii acopar pe toti
    protected CallCenterHandler nextHandler;
    //daca fac private -> setteri si getteri


    //GRESEALA COMUNA! -> callCenterOperator in loc de callCenterHandler
    //trebuie sa trimit ca parametru un obiect ce deriveaza clasa mea abstracta pentru a acoperi toate cazurile de angajati
    public void setNextHandler(CallCenterHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //cererea ce urmeaza a fi gestionata IN FUNCTIE de valoarea ei
    public abstract boolean refund(double sum);

}
