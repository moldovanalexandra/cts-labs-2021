package ro.ase.acs.factorymethod;

public class OpenOfficeWord implements Document {
    String name;

    @Override
    public void open() {
        System.out.println(String.format("The document %s.adt is opening...", name));
    }

    public OpenOfficeWord(String name) {
        this.name = name;
    }


}
