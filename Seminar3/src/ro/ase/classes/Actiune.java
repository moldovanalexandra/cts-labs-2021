package ro.ase.classes;

import java.util.Scanner;

import ro.ase.interfaces.Actualizabil;
import ro.ase.interfaces.Evaluabil;

public class Actiune extends Instrument implements Evaluabil, Actualizabil {
    private float procentDividend;

    public Actiune(String simbol, String nume, double pret, Status stare, float procentDividend) {
        super(simbol, nume, pret, stare);
        this.procentDividend = procentDividend;
    }

    public Actiune() {
        super();
        this.procentDividend = 0.0F;
    }

    public float getProcentDividend() {
        return procentDividend;
    }

    public void setProcentDividend(float procentDividend) {
        this.procentDividend = procentDividend;
    }

    @Override
    public double valoare(Instrument instrument) {
        return this.getPret() +
                (this.getPret() * this.procentDividend / 100.0F);
    }

    @Override
    public Object dinString(String linie, String separator) {
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();
        System.out.println("Clasa citita " + numeClasa);

        Actiune local = new Actiune();
        local.setSimbol(lineScanner.next());
        local.setNume(lineScanner.next());
        local.setPret(lineScanner.nextDouble());
        local.setStare(Status.valueOf(lineScanner.next()));
        local.setProcentDividend(lineScanner.nextFloat());

        return local;
    }

    @Override
    public String toString() {
//        return "Actiune{" +
//                "procentDividend=" + procentDividend +
//                '}';
        return this.getClass().getName() + "," +
                this.getSimbol() + "," +
                this.getNume() + "," +
                Double.toString(this.getPret()) + "," +
                this.getStare().valoare.toString() + "," +
                this.procentDividend;
    }
}