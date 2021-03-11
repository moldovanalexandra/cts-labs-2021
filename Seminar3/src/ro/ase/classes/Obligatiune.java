package ro.ase.classes;

import java.util.Scanner;

import ro.ase.interfaces.Actualizabil;
import ro.ase.interfaces.Evaluabil;

public class Obligatiune extends Instrument implements Evaluabil, Actualizabil {
    private float cupon;

    public Obligatiune(String simbol, String nume, double pret, String stare, float cupon) {
        super(simbol, nume, pret, stare);
        this.cupon = cupon;
    }

    public Obligatiune() {
        super();
        this.cupon = 0.0F;
    }

    public float getCupon() {
        return cupon;
    }

    public void setCupon(float cupon) {
        this.cupon = cupon;
    }

    @Override
    public double valoare(Instrument instrument) {
        return this.getPret() + this.cupon;
    }

    @Override
    public Object dinString(String linie, String separator) {
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();
        System.out.println("Clasa citita " + numeClasa);

        Obligatiune local = new Obligatiune();
        local.setSimbol(lineScanner.next());
        local.setNume(lineScanner.next());
        local.setPret(lineScanner.nextDouble());
        local.setStare(lineScanner.next());
        local.setCupon(lineScanner.nextFloat());

        return local;
    }

}