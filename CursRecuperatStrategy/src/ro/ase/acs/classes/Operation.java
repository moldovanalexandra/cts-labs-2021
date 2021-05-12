package ro.ase.acs.classes;

//iStrategy
//anunt ca fac lamba expressions
@FunctionalInterface
public interface Operation {
    public long applyOperation(Integer[] array);
}
