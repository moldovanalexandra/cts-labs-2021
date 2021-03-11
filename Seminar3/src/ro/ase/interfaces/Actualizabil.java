package ro.ase.interfaces;

import ro.ase.classes.Instrument;

public interface Actualizabil {
    public default void actualizare(Instrument instrument, String stareNoua) {
        instrument.setStare(stareNoua);
    }
}

