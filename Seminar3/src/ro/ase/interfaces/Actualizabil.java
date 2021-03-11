package ro.ase.interfaces;

import ro.ase.classes.Instrument;
import ro.ase.classes.Status;

public interface Actualizabil {
    public default void actualizare(Instrument instrument, Status stareNoua) {
        instrument.setStare(stareNoua);
    }
}

