package ro.ase.acs.factorymethod;

public class ExcelDocument implements Document {
    private String name;

    @Override
    public void open() {
        System.out.println(String.format("The document %s.xls is opening...", name));
    }

    public ExcelDocument(String name) {
        this.name = name;
    }
}
