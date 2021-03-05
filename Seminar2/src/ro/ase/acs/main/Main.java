package ro.ase.acs.main;

import ro.ase.acs.readers.ConsoleReader;
import ro.ase.acs.readers.Readable;
import ro.ase.acs.services.Orchestrator;
import ro.ase.acs.writers.ConsoleWriter;
import ro.ase.acs.writers.Writeable;

public class Main {

	public static void main(String[] args) {
		IoC io = new IoC();
		io.register(Readable.class, ConsoleReader.class);
		io.register(Writeable.class, ConsoleWriter.class);
		
		Readable r = (Readable)io.resolve(Readable.class);
		Writeable w = (Writeable)io.resolve(Writeable.class);
		
		Orchestrator orchestrator = new Orchestrator(r,w,io);
		orchestrator.execute();
	
		
	}

	
}

