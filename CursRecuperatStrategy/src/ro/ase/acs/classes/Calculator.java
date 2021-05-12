package ro.ase.acs.classes;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> values = new ArrayList<>();
    private Operation operation;

    public void addValue(int value){
        values.add(value);
    }

    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public void computeValues(int value){
        values.add(value);
    }

    public void resetValues(){
        values.clear();
    }

    public long operate(){
        if(operation != null) {
            Integer[] array = new Integer[values.size()];
            values.toArray(array);
            return operation.applyOperation(array);
        }
        throw new UnsupportedOperationException();
    }
}
