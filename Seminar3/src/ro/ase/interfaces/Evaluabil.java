package ro.ase.interfaces;

import ro.ase.classes.Instrument;

public interface Evaluabil {
    public default double valoare(Instrument instrument) {
        return instrument.getPret();
    }

    public Object dinString(String linie, String separator);
}