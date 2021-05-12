package ro.ase.acs.simplefactory;

public class WordDocument implements Document {
    private String name;

    @Override
    public void open() {
        System.out.println(String.format("The document %s.docx is opening...", name));
    }

    public WordDocument(String name) {
        this.name = name;
    }
}
