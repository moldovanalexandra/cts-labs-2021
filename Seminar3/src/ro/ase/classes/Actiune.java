package ro.ase.classes;

import java.util.Scanner;

import ro.ase.interfaces.Actualizabil;
import ro.ase.interfaces.Evaluabil;

public class Actiune extends Instrument implements Evaluabil, Actualizabil {
    private float procent_dividend;

    public Actiune(String simbol, String nume, double pret,String stare, float procent_dividend) {
        super(simbol, nume, pret, stare);
        this.procent_dividend = procent_dividend;
    }

    public Actiune() {
        super();
        this.procent_dividend = 0.0F;
    }

    public float getProcentDividend() {
        return procent_dividend;
    }

    public void setProcentDividend(float procentDividend) {
        this.procent_dividend = procentDividend;
    }

    private final float rata_conversie = 100.0F;
    
    @Override
    public double valoare(Instrument instrument) {
        return this.getPret() +
                (this.getPret() * this.procent_dividend / rata_conversie);
    }
}