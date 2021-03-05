package ro.ase.acs.main;

import ro.ase.acs.readers.ConsoleReader;
import ro.ase.acs.readers.Readable;
import ro.ase.acs.services.Orchestrator;
import ro.ase.acs.writers.ConsoleWriter;
import ro.ase.acs.writers.Writeable;

public class Main {

	public static void main(String[] args) {
		IoC ioc = new IoC();
		ioc.register(Readable.class, ConsoleReader.class);
		ioc.register(Writeable.class, ConsoleWriter.class);
		
		Readable reader = (Readable)ioc.resolve(Readable.class);
		Writeable writer = (Writeable)ioc.resolve(Writeable.class);
		
		Orchestrator orchestrator = new Orchestrator(reader,writer,ioc);
		orchestrator.execute();
	}

	
}

