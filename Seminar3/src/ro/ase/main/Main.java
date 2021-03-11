package ro.ase.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import ro.ase.classes.Actiune;
import ro.ase.classes.Instrument;
import ro.ase.classes.Obligatiune;
import ro.ase.classes.PortofoliuGenerics;
import ro.ase.classes.Status;

public class Main {

	public static void main(String[] args) {
	      Instrument instr1 = new Instrument("BRD",
	                "Banca Romana pentru Dezvoltare", 12.78, Status.TRANZACTIONABIL);
	        Instrument instr2= new Instrument("TLV",
	                "Banca Transilvania", 7.34, Status.TRANZACTIONABIL);
	        Instrument instr3 = new Instrument("BVB",
	                "Bursa de Valori Bucuresti", 24.6, Status.NETRANZACTIONABIL);
	        Actiune act1 = new Actiune("ALR", "Alro Slatina", 2.67,
	                Status.TRANZACTIONABIL, 2.7F);
	        Obligatiune oblig1 = new Obligatiune("TGN", "Transgaz", 254.5,
	                Status.NETRANZACTIONABIL, 11F);

	        ArrayList<Instrument> lista = new ArrayList<Instrument>();
	        lista.add(act1);
	        lista.add(oblig1);
	        lista.add(instr1);
	        lista.add(instr2);
	        lista.add(instr3);

	      
	}
}


