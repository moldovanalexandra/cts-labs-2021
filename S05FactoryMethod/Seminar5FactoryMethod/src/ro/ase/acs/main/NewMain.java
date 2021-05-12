package ro.ase.acs.main;

import ro.ase.acs.factorymethod.MicrosoftOfficeFactory;
import ro.ase.acs.factorymethod.Document;
import ro.ase.acs.factorymethod.DocumentFactory;
import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.simplefactory.NoSuchDocumentException;

public class NewMain {

    public static void main(String[] args) {
        DocumentFactory documentFactory = new MicrosoftOfficeFactory();
        try {
            Document document = documentFactory.getDocument(DocumentType.SPREADSHEET, "studenti");
            document.open();
            Document document2 = documentFactory.getDocument(DocumentType.TEXT_EDITOR, "proiect");
            document2.open();
        }catch(NoSuchDocumentException e){
            e.printStackTrace();
        }
    }
}
