package ro.ase.acs.factorymethod;

public class OpenOfficeSpreadsheet implements Document {
    private String name;

    @Override
    public void open() {
        System.out.println(String.format("The document %s.odt is opening...", name));
    }

    public OpenOfficeSpreadsheet(String name) {
        this.name = name;
    }
}
